package com.example.rabbitmq.consumer.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Castle
 * @Date 2021/9/29 15:52
 */
@Configuration
public class RabbitMQConfig {

    /**
     * 交换机名称
     */
    public static final String BILL_TOPIC_EXCHANGE = "bill_topic_exchange";
    /**
     * 队列名称
     */
    public static final String BILL_QUEUE = "bill_queue";

    public static final String BILL_ROUTE_KEY = "bill.#";

    public static final int BILL_QUEUE_TTL = 30000;
    /**
     * 死信队列
     */
    public static final String DEAD_QUEUE = "dead_queue";
    public static final String DEAD_EXCHANGE = "dead_exchange";
    public static final String DEAD_ROUTE_KEY = "dead_route_key";

    /**
     * 声明交换机
     *
     * @return
     */
    @Bean("billTopicExchange")
    public TopicExchange billTopicExchange() {
        //durable 开启持久化
        return ExchangeBuilder.topicExchange(BILL_TOPIC_EXCHANGE).durable(true).build();
    }

    /**
     * 声明队列
     *
     * @return
     */
    @Bean("billQueue")
    public Queue billQueue() {
        //持久化队列
        return QueueBuilder.durable(BILL_QUEUE)
                //.ttl(BILL_QUEUE_TTL)
                //设置死信队列的路由key
                .deadLetterRoutingKey(DEAD_ROUTE_KEY)
                //设置私信队列的交换机
                .deadLetterExchange(DEAD_EXCHANGE)
                .build();
    }

    /**
     * 绑定队列和交换机
     *
     * @return
     */
    @Bean
    public Binding billQueueExchange(@Qualifier("billQueue") Queue queue,
                                     @Qualifier("billTopicExchange") TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(BILL_ROUTE_KEY);
    }

    /**
     * 配置死信队列
     *
     * @return
     */
    @Bean("deadQueue")
    public Queue deadQueue() {
        return QueueBuilder.durable(DEAD_QUEUE).build();
    }

    /**
     * 死信交换机
     *
     * @return
     */
    @Bean("deadExchange")
    public TopicExchange deadExchange() {
        return ExchangeBuilder.topicExchange(DEAD_EXCHANGE).durable(true).build();
    }

    /**
     * 绑定死信队列和交换机
     *
     * @return
     */
    @Bean
    public Binding deadBinding() {
        return BindingBuilder.bind(deadQueue()).to(deadExchange()).with(DEAD_ROUTE_KEY);
    }
}

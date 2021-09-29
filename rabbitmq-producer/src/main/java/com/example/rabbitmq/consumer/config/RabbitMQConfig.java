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

    /**
     * 声明交换机
     *
     * @return
     */
    @Bean("billTopicExchange")
    public Exchange topicExchange() {
        //durable 开启持久化
        return ExchangeBuilder.topicExchange(BILL_TOPIC_EXCHANGE).durable(true).build();
    }

    /**
     * 声明队列
     *
     * @return
     */
    @Bean("billQueue")
    public Queue itemQueue() {
        //持久化队列
        return QueueBuilder.durable(BILL_QUEUE).build();
    }

    /**
     * 绑定队列和交换机
     *
     * @param queue
     * @param exchange
     * @return
     */
    @Bean
    public Binding billQueueExchange(@Qualifier("billQueue") Queue queue,
                                     @Qualifier("billTopicExchange") Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("bill.#").noargs();
    }

}

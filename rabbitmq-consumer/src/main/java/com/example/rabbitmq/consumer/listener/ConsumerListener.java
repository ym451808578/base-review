package com.example.rabbitmq.consumer.listener;

import com.example.rabbitmq.consumer.entity.Msg;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Castle
 * @Date 2021/9/29 17:15
 */
@Component
@Slf4j
public class ConsumerListener {

    @RabbitListener(queues = "bill_queue")
    public void msg(Message message, Channel channel, Msg msg) {
        try {
            log.info("消费者消费的消息：{}", msg);
            //TODO 这里可以做异步工作
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {
            //是否重复消费
            boolean isRedelivered = message.getMessageProperties().getRedelivered();
            try {
                if (isRedelivered) {
                    channel.basicReject(message.getMessageProperties().getDeliveryTag(), false);
                    log.info("消息{}重复消费，丢弃！", message.getBody().toString());
                } else {
                    channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
                    log.info("消息{}处理失败，重新放入队列", message.getBody().toString());
                }
            } catch (Exception e1) {
                e.printStackTrace();
            }
        }

    }
}

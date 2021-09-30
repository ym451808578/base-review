package com.example.rabbitmq.consumer.listener;

import cn.hutool.json.JSONUtil;
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
    public void msg(Message message, Channel channel) {
        try {
            log.info("消费者消费的消息：{}", JSONUtil.toBean(new String(message.getBody()), Msg.class));
            //TODO 这里可以做异步工作,
            int i = 1 / 0;
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {
            //是否重复消费
            log.error("错误消息：{}", e.toString());
            boolean isRedelivered = message.getMessageProperties().getRedelivered();
            log.info("是否消费标志：{}", isRedelivered);
            try {
                if (isRedelivered) {
                    channel.basicReject(message.getMessageProperties().getDeliveryTag(), false);
                    log.info("消息{}重复消费，丢弃！", new String(message.getBody()));
                } else {
                    channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
                    log.info("消息{}处理失败，重新放入队列", new String(message.getBody()));
                }
            } catch (Exception e1) {
                e.printStackTrace();
            }
        }

    }
}

package com.example.rabbitmq.consumer.listener;

import lombok.extern.slf4j.Slf4j;
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
    public void msg(String msg) {
        log.info("消费者消费的消息：{}", msg);
        //TODO 这里可以做异步工作
    }
}

package com.example.boot.mq.service;

import com.example.boot.mq.entity.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author 45180
 */
@Component
public class ConsumerService {

    @JmsListener(destination = "${myqueue}")
    public void consumeMessage(Message message) {
        System.out.println("消费者接收到消息：" + message);
    }
}

package com.example.boot.mq.service;

import com.example.boot.mq.entity.Message;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author 45180
 */
@Component
public class ProducerService {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Resource
    private ActiveMQQueue activeMQQueue;

    @Scheduled(fixedDelay = 3000)
    public void sendMessage() {
        Message message = new Message(UUID.randomUUID().toString(), "haha~~~");
        jmsMessagingTemplate.convertAndSend(activeMQQueue, message);
        System.out.println("发送成功：" + message);
    }
}

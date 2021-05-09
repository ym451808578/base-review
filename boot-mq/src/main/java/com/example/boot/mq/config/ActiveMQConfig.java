package com.example.boot.mq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.DeliveryMode;

/**
 * @author 45180
 */
@EnableJms
@Configuration
public class ActiveMQConfig {

    @Value("${myqueue}")
    private String queueName;

    @Bean
    public ActiveMQQueue messageQueue() {

        return new ActiveMQQueue(queueName);
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setExplicitQosEnabled(true);
        jmsTemplate.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
        return jmsTemplate;
    }
}

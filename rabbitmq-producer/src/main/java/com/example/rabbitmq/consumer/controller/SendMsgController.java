package com.example.rabbitmq.consumer.controller;

import cn.hutool.json.JSONUtil;
import com.example.rabbitmq.consumer.config.RabbitMQConfig;
import com.example.rabbitmq.consumer.entity.Msg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author Castle
 * @Date 2021/9/29 16:04
 */
@RestController
@Slf4j
public class SendMsgController {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void setCallback() {
        //confirm确认消息投递成功了,如果没有exchange ack=false，如果有，则exchange ack=true
        rabbitTemplate.setConfirmCallback((CorrelationData correlationData, boolean ack, String cause) -> {
            log.info("消息id是：{}", correlationData.getId());
            if (ack) {
                log.info("消息发送成功，已确认");
            } else {
                log.info("消息发送失败,原因是:{}", cause);
            }
        });

        //消息返回
        rabbitTemplate.setReturnsCallback((ReturnedMessage returnedMessage) -> {
            log.info("消息退回路由:{}", returnedMessage.getRoutingKey());
            log.info("消息退回的交换机:{}", returnedMessage.getExchange());
            log.info("退回的消息:{}", new String(returnedMessage.getMessage().getBody()));
            log.info("CorrelationId:{}", returnedMessage.getMessage().getMessageProperties().getCorrelationId());
        });
    }

    /**
     * 发送消息
     *
     * @param key
     * @return
     */
    @GetMapping("send")
    public String sendMsg(@RequestParam String key) {
        for (int i = 1; i < 11; i++) {
            String id = i + "";
            Msg msg = new Msg(id, "消息内容来自：" + id);
            CorrelationData correlationData = new CorrelationData(id);
            log.info("msg:{}", msg);
            log.info("key:{}", key);
            rabbitTemplate.convertAndSend(RabbitMQConfig.BILL_TOPIC_EXCHANGE, key, JSONUtil.toJsonStr(msg), correlationData);
        }
        return "success";
    }
}

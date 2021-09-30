package com.example.rabbitmq.consumer.controller;

import cn.hutool.json.JSONUtil;
import com.example.rabbitmq.consumer.config.RabbitMQConfig;
import com.example.rabbitmq.consumer.entity.Msg;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Castle
 * @Date 2021/9/29 16:04
 */
@RestController
@Slf4j
public class SendMsgController {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @GetMapping("send")
    public Msg sendMsg(@RequestParam String key) {
        String id = UUID.randomUUID().toString();
        Msg msg = new Msg(id, "消息内容来自：" + id);
        log.info("msg:{}", msg);
        log.info("key:{}", key);
        rabbitTemplate.convertAndSend(RabbitMQConfig.BILL_TOPIC_EXCHANGE, key, JSONUtil.toJsonStr(msg));
        return msg;
    }
}

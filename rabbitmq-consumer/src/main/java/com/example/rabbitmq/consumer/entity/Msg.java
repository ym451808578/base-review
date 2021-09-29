package com.example.rabbitmq.consumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Castle
 * @Date 2021/9/29 9:54 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Msg {
    private String id;
    private String msg;
}

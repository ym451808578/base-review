package com.example.rabbitmq.consumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Castle
 * @Date 2021/9/29 9:26 下午
 */
@Data
@AllArgsConstructor
public class Msg implements Serializable {

    private String id;
    private String msg;
}

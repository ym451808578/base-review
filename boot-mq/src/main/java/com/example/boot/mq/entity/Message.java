package com.example.boot.mq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 45180
 */
@Data
@AllArgsConstructor
public class Message implements Serializable {
    private String title;
    private String content;
}

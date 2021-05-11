package com.example.bootreview.entity.yml;

import lombok.Data;

import java.util.List;

/**
 * @author Castle
 * @Date 2021/5/11 8:11
 */
@Data
public class Child {
    private String name;
    private int age;
    private List<Friend> friends;
}

package com.example.bootreview.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Castle
 * @Date 2021/5/10 9:22
 */
@Data
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private Teacher teacher;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

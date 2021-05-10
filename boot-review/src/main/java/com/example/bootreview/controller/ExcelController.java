package com.example.bootreview.controller;

import com.example.bootreview.entity.Student;
import com.example.bootreview.service.ResponseToXlsConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Castle
 * @Date 2021/5/10 9:41
 */
@RestController
public class ExcelController {

    @Resource
    private ResponseToXlsConverter responseToXlsConverter;

    @GetMapping(value = "/student", produces = "application/vnd.ms-excel")
    public Student getStudent() {
        Student student = new Student(1L, "castle");
        return student;
    }
}

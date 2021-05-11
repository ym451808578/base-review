package com.example.bootreview;

import com.example.bootreview.entity.Course;
import com.example.bootreview.entity.School;
import com.example.bootreview.entity.Student;
import com.example.bootreview.entity.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 45180
 */
@SpringBootApplication
@ServletComponentScan
public class BootReviewApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(BootReviewApplication.class, args);
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println(name);
//        }
//        System.out.println("*************************");
//        Student student = run.getBean("castle", Student.class);
//        Student student1 = run.getBean("anny", Student.class);
//        Teacher teacher = run.getBean("myTeacher", Teacher.class);
//        System.out.println("两个bean一致：" + (student.getTeacher() == teacher));
//        System.out.println("两个bean一致：" + (student1.getTeacher() == teacher));
//        System.out.println("是否存在course的bean：" + run.getBeanNamesForType(Course.class).length);
//        System.out.println(run.getBean("school", School.class).getId());
    }

}

package com.example.bootreview.config;

import com.example.bootreview.entity.Course;
import com.example.bootreview.entity.Student;
import com.example.bootreview.entity.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 * Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 * Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 * 组件依赖必须使用Full模式默认。其他默认是非Lite模式
 * 非lite模式中，使用传参实现组件依赖
 * <p>
 * Spring 5.2.0+的版本，建议你的配置类均采用Lite模式去做，即显示设置proxyBeanMethods = false。
 * Spring Boot在2.2.0版本（依赖于Spring 5.2.0）起就把它的所有的自动配置类的此属性改为了false，
 * 即@Configuration(proxyBeanMethods = false)，提高Spring启动速度
 *
 * @author Castle
 * @Date 2021/5/10 15:21
 */
@Import({Course.class})
@Configuration(proxyBeanMethods = true)
public class MyConfig {
    @Bean("castle")
    public Student student() {
        Student student = new Student(1L, "Castle");
        //proxyBeanMethods = false 报红色
        student.setTeacher(teacher());
        return student;
    }

    /**
     * false情况下使用此方法
     *
     * @param teacher
     * @return
     */
    @Bean("anny")
    public Student anotherStudent(Teacher teacher) {
        Student student = new Student(2L, "Anny", teacher);
        return student;
    }

    @Bean("myTeacher")
    public Teacher teacher() {
        Teacher teacher = new Teacher(2L, "YM");
        return teacher;
    }
}

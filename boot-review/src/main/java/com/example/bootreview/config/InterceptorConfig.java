package com.example.bootreview.config;

import com.example.bootreview.intercepter.MyHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author Castle
 * @Date 2021/5/11 17:04
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    private MyHandlerInterceptor myHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myHandlerInterceptor).addPathPatterns("/*");
    }
}

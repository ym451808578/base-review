package com.example.bootreview.config;

import com.example.bootreview.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Castle
 * @Date 2021/5/11 16:36
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {

        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setName("myFilter");
        registrationBean.setOrder(10);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}

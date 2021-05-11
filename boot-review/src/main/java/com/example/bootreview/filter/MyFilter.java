package com.example.bootreview.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Castle
 * @Date 2021/5/11 16:08
 */
@Slf4j
//@WebFilter(filterName = "myFilter", urlPatterns = {"/*"})
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("请求之前");
        chain.doFilter(request, response);
        log.info("请求之后");
    }

    @Override
    public void destroy() {
        log.info("filter 销毁");
    }
}

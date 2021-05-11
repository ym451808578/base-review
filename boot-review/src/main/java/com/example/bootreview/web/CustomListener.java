package com.example.bootreview.web;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Castle
 * @Date 2021/5/11 11:52
 */
@Slf4j
@WebListener
public class CustomListener implements ServletContextListener, ServletRequestListener, HttpSessionListener, ServletRequestAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("******Context创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("********Context销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("*********request销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("***********request创建");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("********session创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("*********session销毁");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("**********添加attribute");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        log.info("*********移除attribute");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("*********替换attribute");
    }
}

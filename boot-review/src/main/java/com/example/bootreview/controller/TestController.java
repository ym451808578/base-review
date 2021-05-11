package com.example.bootreview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Castle
 * @Date 2021/5/11 15:17
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String testServlet(HttpServletRequest request, HttpSession session) {
        request.setAttribute("a", "a");
        request.setAttribute("a", "b");
        request.getAttribute("a");
        request.removeAttribute("a");

        session.setAttribute("a", "a");
        session.getAttribute("a");
        session.invalidate();
        return "success";
    }
}

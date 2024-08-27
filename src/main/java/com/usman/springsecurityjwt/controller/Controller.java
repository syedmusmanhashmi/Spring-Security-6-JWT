package com.usman.springsecurityjwt.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Welcome to Developer " + request.getSession().getId();
    }

}

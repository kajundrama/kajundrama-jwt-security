package com.kajundrama.jwt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloController {

    // commit을 위한 주석 추가
    @GetMapping
    public String hello() {
        return "Hello World";
    }
}

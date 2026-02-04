package com.awspractica.awspractica.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/aws/api")
public class AWSControllerTest {

    @GetMapping("/hello")
    public String helo(){
        return "hello AWS - GET!!";
    }

    @PostMapping("/hello/post")
    public String helloPost(){
        return "hello AWS - POST !!";
    }

}
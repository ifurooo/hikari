package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/provider")
public class HelloController {
    @Value("${server.port}")
    private String port;
    @GetMapping(value = "/hello")
    public String hello() {
        return "啸神在此"+"</br>port:"+port;
    }

}

package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

@RequestMapping(value = "/provider")
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/helloId/{id}")//传参
    public String helloId(@PathVariable("id") String id) {
        return "服务名：provider"+"</br>端口号:"+port+"</br>传入参数："+id;
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "服务名：provider"+"</br>端口号:"+port;
    }
}

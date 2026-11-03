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
    @Value("${server.port}")//从配置文件注入当前服务端口；返回值带上端口号，用于直观验证负载均衡是否把请求分发到不同实例
    private String port;

    @GetMapping(value = "/helloId/{id}")//传参 @PathVariable：把 URL 路径中的 {id} 占位符绑定到方法参数
    public String helloId(@PathVariable("id") String id) {
        return "服务名：provider"+"</br>端口号:"+port+"</br>传入参数："+id;
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "服务名：provider"+"</br>端口号:"+port;//返回服务名+端口：多实例启动时可观察请求被路由到哪台机器
    }
}

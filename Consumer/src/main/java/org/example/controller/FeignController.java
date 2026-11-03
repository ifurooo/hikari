package org.example.controller;

import org.example.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/consumer")  //统一前缀 /consumer，网关按 /consumer/** 把请求转发到本服务
public class FeignController {
    @Autowired
    private FeignService feignService;// 注入 Feign 代理，调用它即调用远程 provider 接口

    @GetMapping(value = "/feign")     // 经网关访问 http://localhost:7777/consumer/feign 验证Feign调用
    public String getFeign() {
        return feignService.getFeign();// 像调用本地方法一样发起远程请求
    }
}

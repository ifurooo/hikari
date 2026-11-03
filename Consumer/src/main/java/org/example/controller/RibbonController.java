package org.example.controller;

import org.example.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/consumer")
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;//注入使用 RestTemplate 的 Ribbon 调用服务
    @GetMapping(value = "/ribbon")      //经网关访问 http://localhost:7777/consumer/ribbon 验证 Ribbon 负载均衡
    public String getRibbonService() {
        return ribbonService.getRibbonService();
    }
}

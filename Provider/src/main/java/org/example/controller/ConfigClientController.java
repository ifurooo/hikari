package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping(value = "/provider")
public class ConfigClientController {
    @Value("${config.info:未读取到配置信息}")//配置信息
    private String ConfigInfo;
    @GetMapping("/config/info")
    public String getConfigInfo(){
        return ConfigInfo;
    }
}


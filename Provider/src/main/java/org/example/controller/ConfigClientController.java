package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//配置热刷新：Nacos 配置中心里的配置变更后，无需重启服务即可自动刷新本类中用到的属性
@RequestMapping(value = "/provider")
public class ConfigClientController {
    @Value("${config.info}")//从配置中心读取 config.info 配置项（该值在 Nacos 控制台配置，而非本地 yml）
    private String ConfigInfo;
    @GetMapping("/config/info")
    public String getConfigInfo(){
        return ConfigInfo;
    }
}


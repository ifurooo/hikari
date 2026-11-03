package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication//Spring Boot 启动类：自动配置 + 组件扫描，是微服务进程的入口
@EnableDiscoveryClient//开启服务发现客户端：把当前服务实例注册到 Nacos 注册中心
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}

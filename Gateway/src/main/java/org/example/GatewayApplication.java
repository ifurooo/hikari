package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  // 注册到 Nacos，网关才能按服务名发现下游微服务的实例
public class GatewayApplication {
    public  static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}

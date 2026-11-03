package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient  // 注册到 Nacos，使消费端成为服务注册与发现的一员
@EnableFeignClients     // 开启 OpenFeign：扫描 @FeignClient 接口并自动生成代理实现
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    // ★★ 负载均衡实现核心点：在 RestTemplate Bean 上标注 @LoadBalanced，
    //    之后用 "http://provider/..." 这种【服务名】URL 发起调用时，
    //    Ribbon 会先从 Nacos 拿到 provider 的全部实例，再按轮询策略选中一个实例去请求
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
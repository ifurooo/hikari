package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;
    public String getRibbonService() {
        return restTemplate.getForObject("http://provider/provider/hello", String.class);
        // URL 写的是"服务名 provider"而不是 IP:端口；因为 RestTemplate 上加了 @LoadBalanced，
        // Ribbon 会自动解析服务名、做负载均衡后把真实请求转发到某个 provider 实例
    }
}

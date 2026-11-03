package org.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service  // 交给 Spring 容器管理（Feign 接口本身不强制需要 @Service，保留亦无妨）
@FeignClient(name = "provider")  // 声明这是一个 Feign 客户端，name = 要调用的目标服务名(provider)
public interface FeignService {
    // 接口方法 + 目标服务内的请求映射，Feign 会自动生成实现：向 provider 服务的 /provider/hello 发 GET 请求
    @GetMapping(value = "/provider/hello")
    public String getFeign();
}

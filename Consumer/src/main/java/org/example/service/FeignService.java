package org.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "provider")
public interface FeignService {
    @GetMapping(value = "/provider/hello")
    public String getFeign();
}

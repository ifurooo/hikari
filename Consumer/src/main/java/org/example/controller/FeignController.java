package org.example.controller;

import org.example.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/consumer")
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/feign")
    public String getFeign() {
        return feignService.getFeign();
    }
}

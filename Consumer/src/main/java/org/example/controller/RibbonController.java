package org.example.controller;

import org.example.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/consumer")
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;
    @GetMapping(value = "/ribbon")
    public String getRibbonService() {
        return ribbonService.getRibbonService();
    }
}

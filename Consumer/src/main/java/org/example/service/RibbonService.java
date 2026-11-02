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
    }
}

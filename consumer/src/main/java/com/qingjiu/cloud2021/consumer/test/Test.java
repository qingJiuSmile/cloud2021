package com.qingjiu.cloud2021.consumer.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Test {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String getSa() {
        return restTemplate.getForObject("http://localhost:8031/test", String.class);
    }
}

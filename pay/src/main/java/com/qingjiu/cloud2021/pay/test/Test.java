package com.qingjiu.cloud2021.pay.test;

import com.qingjiu.cloud2021.eneiity.Fragment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/test")
    public String naamee(){
        System.out.println(222);
        return "1232";
    }
}

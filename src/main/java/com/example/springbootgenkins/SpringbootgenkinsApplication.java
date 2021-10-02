package com.example.springbootgenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootgenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootgenkinsApplication.class, args);
    }

    @RequestMapping("/jenkins")
    public String testMapping(){
        return "Jenkins Test";
    }

}

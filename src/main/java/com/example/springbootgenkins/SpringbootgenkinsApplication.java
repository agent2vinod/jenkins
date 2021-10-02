package com.example.springbootgenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringbootgenkinsApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringbootgenkinsApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application Started !!");
    }

    public static void main(String[] args) {
        logger.info("Application Executed !!");
        SpringApplication.run(SpringbootgenkinsApplication.class, args);
    }

    @RequestMapping("/jenkins")
    public String testMapping(){
        return "Jenkins Test";
    }

}

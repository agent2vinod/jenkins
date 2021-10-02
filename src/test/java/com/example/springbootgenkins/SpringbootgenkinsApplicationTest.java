package com.example.springbootgenkins;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.slf4j.LoggerFactory;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootgenkinsApplicationTest {

    public static Logger logger =  LoggerFactory.getLogger(SpringbootgenkinsApplication.class);

    @Test
    public void contextLoads() {
        logger.info("Test case executed");
        Assert.assertEquals(true,true);
    }


}

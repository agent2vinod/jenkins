package com.example.springbootgenkins;

import org.junit.Assert;
import org.junit.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootgenkinsApplicationTest {

    public static Logger logger = (Logger) LoggerFactory.getLogger(SpringbootgenkinsApplication.class);

    @Test
    public void contextLoads() {
        logger.info("Test case executed");
        Assert.assertEquals(true,true);
    }


}

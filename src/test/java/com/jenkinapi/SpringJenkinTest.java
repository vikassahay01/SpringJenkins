package com.jenkinapi;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinTest {
    static Logger log = LoggerFactory.getLogger(SpringJenkinTest.class);
   @Test
    public void contextloads(){
       log.info("Test Case executed");
       assertEquals(true,true);
    }
}

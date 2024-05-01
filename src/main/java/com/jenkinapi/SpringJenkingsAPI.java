package com.jenkinapi;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkingsAPI {

   public static Logger log = LoggerFactory.getLogger(SpringJenkingsAPI.class);

    @PostConstruct
    public void initconfig() {
        log.info("Application started");
    }


    public static void main(String[] args) {
        log.info("Application executed");
        log.info("Application executed with second time");
        SpringApplication.run(SpringJenkingsAPI.class, args);
    }
}

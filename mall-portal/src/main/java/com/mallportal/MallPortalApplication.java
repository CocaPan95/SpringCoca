package com.mallportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages  = "com")
public class MallPortalApplication {


    public static void main(String[] args) {
        SpringApplication.run(MallPortalApplication.class, args);
    }

}

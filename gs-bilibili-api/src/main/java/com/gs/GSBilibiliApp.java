package com.gs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GSBilibiliApp {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(GSBilibiliApp.class, args);
    }
}

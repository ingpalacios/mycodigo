package com.implementacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WrestApplication {

    public static void main(String[] args) {
        System.setProperty("server.port", "8092");
        SpringApplication.run(WrestApplication.class, args);
    }

}

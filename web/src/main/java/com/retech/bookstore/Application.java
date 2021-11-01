package com.retech.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.retech.bookstore")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

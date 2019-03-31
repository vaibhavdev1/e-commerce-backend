package com.vaibhav.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceApplication {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(ECommerceApplication.class, args)));
    }
}

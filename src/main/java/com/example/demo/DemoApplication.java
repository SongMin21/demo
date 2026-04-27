package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        printStartupMessage(context);
    }

    private static void printStartupMessage(ConfigurableApplicationContext context) {
        String appName = context.getEnvironment().getProperty("spring.application.name", "demo");
        System.out.println("Application started: " + appName);
    }

    public static String getVersion() {
        return "1.0.0";
    }

    public static String getDescription() {
        return "Demo application for git workflow practice";
    }
}
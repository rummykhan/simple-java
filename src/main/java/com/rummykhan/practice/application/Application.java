package com.rummykhan.practice.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application extends ConsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String[] args) {
        String name  = this.console.input("What is your name", true);

        log.info("Hello, {}", name);
    }

}

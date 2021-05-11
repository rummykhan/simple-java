package com.rummykhan.practice.application.config;

import com.rummykhan.practice.application.input.ConsoleInput;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public ConsoleInput consoleInput(){
        return new ConsoleInput();
    }
}

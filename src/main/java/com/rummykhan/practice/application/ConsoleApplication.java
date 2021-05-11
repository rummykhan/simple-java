package com.rummykhan.practice.application;

import com.rummykhan.practice.application.input.ConsoleInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public abstract class ConsoleApplication implements CommandLineRunner {

    @Autowired
    protected ConsoleInput console;

}

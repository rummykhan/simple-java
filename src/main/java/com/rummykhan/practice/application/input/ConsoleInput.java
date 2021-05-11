package com.rummykhan.practice.application.input;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInput {

    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    public String input() {
        return this.input(null, false);
    }

    public String input(String message) {
        return this.input(message, false);
    }

    public String input(String message, Boolean required) {
        System.out.println("> " + message);
        return this.scanner.nextLine();
    }
}

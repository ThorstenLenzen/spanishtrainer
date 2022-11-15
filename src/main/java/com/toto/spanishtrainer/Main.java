package com.toto.spanishtrainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class Main {

    public static void main(String[] args) {
        try {
            SpringApplication.run(Main.class, args);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
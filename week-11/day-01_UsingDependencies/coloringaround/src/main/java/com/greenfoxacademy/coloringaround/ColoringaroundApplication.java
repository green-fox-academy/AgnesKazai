package com.greenfoxacademy.coloringaround;

import com.greenfoxacademy.coloringaround.services.Printer;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringaroundApplication implements CommandLineRunner {

    @Autowired
    Printer printer;

    public static void main(String[] args) {
        SpringApplication.run(ColoringaroundApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Hello");
    }
}

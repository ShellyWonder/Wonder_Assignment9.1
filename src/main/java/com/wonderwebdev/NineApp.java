package com.wonderwebdev;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wonderwebdev.nine")
public class NineApp {
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(NineApp.class, args);
		
		
	}


}
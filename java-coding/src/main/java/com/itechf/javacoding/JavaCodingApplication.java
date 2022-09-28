package com.itechf.javacoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCodingApplication implements CommandLineRunner {

	@Autowired
	private Feature11 f11;

	public static void main(String[] args) {
		SpringApplication.run(JavaCodingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Started...");
		System.out.println("---------------------------------");
		System.out.println();
		
		f11.problem1();
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Completed");
		
	}

}

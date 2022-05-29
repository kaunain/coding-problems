package com.itechf.javacoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCodingApplication implements CommandLineRunner {

	@Autowired
	private Basic basic;

	@Autowired
	private Feature8 f8;

	public static void main(String[] args) {
		SpringApplication.run(JavaCodingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Started...");
		System.out.println("---------------------------------");
		System.out.println();
		
		// basic.reverseString("Core Java");
		
		f8.print();
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Completed");
		
	}

}

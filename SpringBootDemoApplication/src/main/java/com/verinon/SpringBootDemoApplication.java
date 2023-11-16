package com.verinon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = a + b;
		System.out.println(" addition"  + c);
		int d=a*b;
		System.out.println(" multiplication:"  + d);
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("Demo Branch Testing....!");
	}

}

package com.spring.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
@EnableJms
@SpringBootApplication
@ComponentScan(basePackages = "com.spring.jms")
public class SpringJmsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJmsExampleApplication.class, args);
	}
}

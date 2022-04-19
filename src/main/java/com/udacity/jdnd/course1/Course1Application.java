package com.udacity.jdnd.course1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Course1Application {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {

		SpringApplication.run(Course1Application.class, args);
	}


}

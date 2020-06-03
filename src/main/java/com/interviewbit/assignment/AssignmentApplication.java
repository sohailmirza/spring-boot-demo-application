package com.interviewbit.assignment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {

		return args -> {
			System.out.println("Beans in Spring boot:");
			String[] beans = context.getBeanDefinitionNames();
			for(String bean : beans) {
				System.out.println(bean);
			}
		};
	}

}

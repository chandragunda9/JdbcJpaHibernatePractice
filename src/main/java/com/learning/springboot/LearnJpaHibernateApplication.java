package com.learning.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJpaHibernateApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(LearnJpaHibernateApplication.class, args);

//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}

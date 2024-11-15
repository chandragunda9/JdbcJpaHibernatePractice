package com.learning.springboot.jpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJpaRepository courseJpaRepository;

	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(1, "java jpa", "in28");
		courseJpaRepository.insert(c1);

		Course c2 = new Course(2, "java2 jpa", "in28");
		courseJpaRepository.insert(c2);

		Course c3 = new Course(3, "java3 jpa", "in28");
		courseJpaRepository.insert(c3);

		Course c4 = new Course(4, "java4 jpa", "in28");
		courseJpaRepository.insert(c4);

		courseJpaRepository.deleteById(1);

		Course c = courseJpaRepository.findById(2);
		System.out.println(c);
	}

}

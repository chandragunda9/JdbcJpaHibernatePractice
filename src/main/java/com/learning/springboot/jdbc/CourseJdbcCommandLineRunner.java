package com.learning.springboot.jdbc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository courseJdbcRepository;

	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(1, "java", "in28");
		courseJdbcRepository.insert(c1);

		Course c2 = new Course(2, "java2", "in28");
		courseJdbcRepository.insert(c2);

		Course c3 = new Course(3, "java3", "in28");
		courseJdbcRepository.insert(c3);

		Course c4 = new Course(4, "java4", "in28");
		courseJdbcRepository.insert(c4);

		courseJdbcRepository.deleteById(1);

		Course c = courseJdbcRepository.findById(2);
		System.out.println(c);
	}

}

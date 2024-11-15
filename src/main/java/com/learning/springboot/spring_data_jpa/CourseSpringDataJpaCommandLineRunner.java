package com.learning.springboot.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.springboot.jpa.Course;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(1, "java data jpa", "in28");
		courseSpringDataJpaRepository.save(c1);

		Course c2 = new Course(2, "java2 data jpa", "in28");
		courseSpringDataJpaRepository.save(c2);

		Course c3 = new Course(3, "java3 data jpa", "in28");
		courseSpringDataJpaRepository.save(c3);

		Course c4 = new Course(4, "java4 data jpa", "in28");
		courseSpringDataJpaRepository.save(c4);

		courseSpringDataJpaRepository.deleteById(1L);

		System.out.println(courseSpringDataJpaRepository.findById(2L));
		System.out.println(courseSpringDataJpaRepository.findById(4L));
		
		System.out.println(courseSpringDataJpaRepository.findAll());
		System.out.println(courseSpringDataJpaRepository.count());
		
		System.out.println(courseSpringDataJpaRepository.findByAuthor("hello"));
		System.out.println(courseSpringDataJpaRepository.findByAuthor("in28"));
		
	}

}

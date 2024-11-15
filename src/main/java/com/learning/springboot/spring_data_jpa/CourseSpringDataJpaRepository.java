package com.learning.springboot.spring_data_jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.springboot.jpa.Course;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	public List<Course> findByAuthor(String a);
}

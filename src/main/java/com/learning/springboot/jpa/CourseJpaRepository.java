package com.learning.springboot.jpa;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course);
	}

	public void deleteById(long id) {
		Course c = entityManager.find(Course.class, id);
		entityManager.remove(c);
	}

	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}

}

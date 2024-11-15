package com.learning.springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

//	String INSERT_QUERY=""" 
//			insert into courses values(1, 'Learn Spring', 'in28min');
//			""";

	String INSERT_QUERY = """
			insert into courses values(?, ?, ?);
			""";

	String DELETE_QUERY = """
			delete from courses where id =?;
			""";

	String SELECT_QUERY = """
			select * from courses where id = ?;
			""";
//	public void insert() {
//		jdbcTemplate.update(INSERT_QUERY);
//	}

	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(long id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}

	public Course findById(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}

}

package com.springbootDataJpa.springdatajpa.repository;

import com.springbootDataJpa.springdatajpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}

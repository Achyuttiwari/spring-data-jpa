package com.springbootDataJpa.springdatajpa.repository;

import com.springbootDataJpa.springdatajpa.entity.Course;
import com.springbootDataJpa.springdatajpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course course1 =
                Course.builder()
                        .title("DB")
                        .credit(6)
                        .build();
        Course course2 =
                Course.builder()
                        .title("JavaProject")
                        .credit(8)
                        .build();
        Teacher teacher =
                Teacher.builder()
                        .firstName("Shree Ram Ji")
                        .lastName("Ki Jai Ho")
                        .courses(List.of(course1, course2))
                        .build();
        teacherRepository.save(teacher);
    }
}
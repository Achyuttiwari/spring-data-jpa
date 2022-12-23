package com.springbootDataJpa.springdatajpa.repository;

import com.springbootDataJpa.springdatajpa.entity.Course;
import com.springbootDataJpa.springdatajpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial(){
        Course course =
                Course.builder()
                        .title("DSA")
                        .credit(4)
                        .build();
        CourseMaterial courseMaterial =
                CourseMaterial.builder()
                        .url("dsa.com")
                        .course(course)
                        .build();
        courseMaterialRepository.save(courseMaterial);

    }
    @Test
    public void fetchAllCourseMaterial(){
        List<CourseMaterial> courseMaterials =
                courseMaterialRepository.findAll();
        System.out.println("courseMaterials = " + courseMaterials);
    }

}
package com.springbootDataJpa.springdatajpa.repository;

import com.springbootDataJpa.springdatajpa.entity.Guardian;
import com.springbootDataJpa.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student =
                Student.builder()
                        .firstName("Achyut")
                        .lastName("Tiwari")
                        .emailId("achyuttiwari@gmail.com")
//                        .guardianName("Mr. Pradeep")
//                        .guardianEmail("pradeep@gmail.com")
//                        .guardianMobile("0909090909")
                        .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian =
                Guardian.builder()
                        .name("Mr Amit")
                        .email("amit@gmail.com")
                        .mobile("9383773737").build();
        Student student =
                Student.builder()
                        .firstName("Abhishek")
                        .lastName("Singh")
                        .emailId("abhisheksingh@gmail.com")
                        .guardian(guardian)
                        .build();
        studentRepository.save(student);
    }

    @Test
    public void allStudentList() {
        List<Student> studentList =
                studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }

    @Test
    public void findStudentByName() {
        List<Student> studentName =
                studentRepository.findByFirstName("Shivam");
        System.out.println("studentName = " + studentName);
    }

    @Test
    public void printGetStudentByEmailAddress() {
        Student student =
                studentRepository.getStudentByEmailAddress(
                        "shivamtiwari@gmail.com"
                );
        System.out.println("student = " + student);
    }

    @Test
    public void printFirstNameGetStudentByEmailAddress() {
        String firstName =
                studentRepository.getStudentFirstNameByEmailAddress(
                        "shivamtiwari@gmail.com"
                );
        System.out.println("firstName = " + firstName);
    }
    @Test
    public void printGetStudentByEmailAddressNative() {
        Student student =
                studentRepository.getStudentByEmailAddressNative(
                        "shivamtiwari@gmail.com"
                );
        System.out.println("student = " + student);
    }
    @Test
    public void printGetStudentByEmailAddressNativeNamedParam() {
        Student student =
                studentRepository.getStudentByEmailAddressNativeNamedParam(
                        "shivamtiwari@gmail.com"
                );
        System.out.println("student = " + student);
    }
    @Test
    public void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId("Achyut Tiwari",
                "achyuttiwari@gmail.com");
    }
}
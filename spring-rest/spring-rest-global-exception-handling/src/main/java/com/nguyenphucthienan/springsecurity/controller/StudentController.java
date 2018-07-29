package com.nguyenphucthienan.springsecurity.controller;

import com.nguyenphucthienan.springsecurity.exception.StudentNotFoundException;
import com.nguyenphucthienan.springsecurity.model.Student;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private List<Student> students;

    @PostConstruct
    public void postConstruct() {
        students = new ArrayList<>();
        students.add(new Student("John", "Doe"));
        students.add(new Student("Jane", "Doe"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId < 0 || studentId >= students.size()) {
            throw new StudentNotFoundException("Student ID not found - " + studentId);
        }
        return students.get(studentId);
    }
}

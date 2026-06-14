package com.example.experiment_11;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Student Management REST API";
    }

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(101, "Ankit", "B.Tech CSE");
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {
        return "Student Added Successfully : "
                + student.getName();
    }
}
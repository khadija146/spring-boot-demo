package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        return List.of(
                new Student(1, "Khadija", "khadija@example.com"),
                new Student(2, "Leyli", "leyli@example.com")
        );
    }
}
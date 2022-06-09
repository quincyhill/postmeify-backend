package com.postmeify.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// the path
@RequestMapping(path = "api/v1/student")
public class StudentController {

    // This will be instantiated and by using the @Autowired annotation, it will be
    // injected
    private final StudentService studentService;

    // Make sure to annotate in order to make it REST

    @Autowired
    public StudentController(StudentService studentService) {
        // Use dependency injection to get the service

        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}

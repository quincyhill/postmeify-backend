package com.postmeify.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    // Make sure to annotate in order to make it REST

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Mark", "mark.some@mail.com", LocalDate.of(1990, Month.JANUARY, 5), 21));
    }
}

package com.postmeify.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// This has to be instantiated
// They can be either servic or component but service is better for semantics /
// readability
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Mark", "mark.some@mail.com", LocalDate.of(1990, Month.JANUARY, 5), 21));
    }
}

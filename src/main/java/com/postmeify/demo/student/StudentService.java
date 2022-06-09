package com.postmeify.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// This has to be instantiated
// They can be either servic or component but service is better for semantics /
// readability
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        /*
         * return List.of(
         * new Student(1L, "Mark", "mark.some@mail.com", LocalDate.of(1990,
         * Month.JANUARY, 5), 21));
         */

        // Returns a list of students
        return studentRepository.findAll();
    }
}

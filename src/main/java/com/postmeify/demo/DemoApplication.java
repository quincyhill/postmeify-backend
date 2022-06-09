package com.postmeify.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.postmeify.demo.student.Student;

@SpringBootApplication
// This annotation makes this class able to serve REST

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// Make sure to annotate in order to make it REST
	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(1L, "Mark", "mark.some@mail.com", LocalDate.of(1990, Month.JANUARY, 5)));
	}
}

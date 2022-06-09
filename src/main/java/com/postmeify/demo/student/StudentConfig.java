package com.postmeify.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    // The Bean annotation is used to register a bean in the Spring container
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        // Java 8 Lambda expression
        return args -> {
            Student mark = new Student("Mark", "mark.some@mail.com", LocalDate.of(1998,
                    Month.JANUARY, 5), 24);

            Student alex = new Student("Alex", "mark.some@mail.com", LocalDate.of(2000,
                    Month.FEBRUARY, 16), 22);

            repository.saveAll(List.of(mark, alex));
        };
    }
}

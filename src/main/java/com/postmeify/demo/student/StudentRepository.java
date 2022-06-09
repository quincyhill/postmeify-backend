package com.postmeify.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// The student is the type and the identifer is a Long
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

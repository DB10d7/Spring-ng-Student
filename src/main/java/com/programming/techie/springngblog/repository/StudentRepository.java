package com.programming.techie.springngblog.repository;

import com.programming.techie.springngblog.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
package com.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymeleaf.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

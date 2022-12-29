package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.student.Student;

@Component
public interface StudentRepository extends JpaRepository<Student, Long>{

}

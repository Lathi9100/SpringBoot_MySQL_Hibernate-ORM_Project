package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.student.Student;

@Service
public interface StudentService {

	void saveStudent(Student std);
	
	List<Student> getAllStudents();
	
	Student getStudentById(long id);
	
	Student updateStudentById(Student std, long id);
	
	void deleteStudentById(long id);
}

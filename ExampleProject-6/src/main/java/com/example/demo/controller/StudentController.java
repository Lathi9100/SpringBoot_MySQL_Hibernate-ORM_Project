package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceImplementation.StudentServiceImpl;
import com.example.demo.student.Student;

@RestController
@RequestMapping("api")
public class StudentController {

	@Autowired
	StudentServiceImpl stdService;
	
	StudentController(StudentServiceImpl stdService){
		super();
		this.stdService=stdService;
	}
	
	@PostMapping("save")
	public void saveStudent(@RequestBody Student std) {
		stdService.saveStudent(std);
	}
	@GetMapping("students")
	public List<Student> getAllStudents(){
		return stdService.getAllStudents();
	}
	@GetMapping("student/{id}")
	public Student getStudentById(@PathVariable("id") long id) {
		return stdService.getStudentById(id);
	}
	@PutMapping("put/{id}")
	public Student updtateStudentById(@RequestBody Student std,@PathVariable("id") long id) {
		return stdService.updateStudentById(std, id);
	}
	@DeleteMapping("delete/{id}")
	public String deleteStudentById(@PathVariable("id") long id) {
		stdService.deleteStudentById(id);
		return "Student Deleted Successfully";
	}
}









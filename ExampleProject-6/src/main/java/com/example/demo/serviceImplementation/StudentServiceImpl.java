package com.example.demo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.example.demo.student.Student;

@Component
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository stdRepo;
	
	StudentServiceImpl(StudentRepository stdRepo){
		this.stdRepo=stdRepo;
	}
	@Override
	public void saveStudent(Student std) {
		stdRepo.save(std);
	}
	@Override
	public List<Student> getAllStudents(){
		return stdRepo.findAll();
	}
	@Override
	public Student getStudentById(long id) {
		return stdRepo.findById(id).orElseThrow();	
	}
	@Override
	public Student updateStudentById(Student std, long id) {
		Student existingStd = stdRepo.findById(id).orElseThrow();
		existingStd.setId(std.getId());
		existingStd.setName(std.getName());
		existingStd.setMail(std.getMail());
		existingStd.setAddress(std.getAddress());
		
		stdRepo.save(existingStd);
		return existingStd;
	}
	@Override
	public void deleteStudentById(long id) {
		stdRepo.deleteById(id);
	}
	
}








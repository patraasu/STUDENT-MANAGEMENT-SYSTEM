package com.sms.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.serviceImpl.StudentServiceImpl;

@RestController
@CrossOrigin("*")
public class StudentController {
public StudentServiceImpl studentServiceImpl;

	
	
	public StudentController(StudentServiceImpl studentServiceImpl) {
	super();
	this.studentServiceImpl = studentServiceImpl;
}



	@PostMapping("/addstudent")
	public ResponseEntity<Student> saveEmployeee(@RequestBody Student student){
		return new ResponseEntity<Student>
		(studentServiceImpl.saveStudent(student),HttpStatus.CREATED);
		}
	
	

	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentServiceImpl.getStudents();
	}
	
}

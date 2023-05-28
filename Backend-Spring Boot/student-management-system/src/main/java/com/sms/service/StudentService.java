package com.sms.service;

import java.util.List;

import com.sms.entity.Student;

public interface StudentService  {

	public Student saveStudent(Student student);
	public List<Student> getStudents();
}

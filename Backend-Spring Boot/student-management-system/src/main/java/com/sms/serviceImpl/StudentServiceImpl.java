package com.sms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	public StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student saveStudent(Student student) {
		System.out.println(student);
			return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	

}

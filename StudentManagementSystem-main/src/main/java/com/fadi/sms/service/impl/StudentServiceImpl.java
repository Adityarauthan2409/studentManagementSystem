package com.fadi.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fadi.sms.entity.Student;
import com.fadi.sms.repository.StudentRepository;
import com.fadi.sms.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student findStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(long id) {
		
		studentRepository.deleteById(id);
	}

}

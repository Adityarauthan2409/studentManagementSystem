package com.fadi.sms.service;

import java.util.List;

import com.fadi.sms.entity.Student;


public interface StudentService {

	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student findStudentById(long id);
	public Student updateStudent(Student student);
	public void deleteStudentById(long id);
}

package com.amol.Service;

import java.util.List;

import com.amol.Entity.Student;

public interface IStudentService {
	
	Student addStudent(Student student);
	List<Student> getAllStudent();
	Student findStudentById(Integer id);
	String deleteStudentById(Integer id);
	String updateStudent(Student student);
	
	
}

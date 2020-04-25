package com.amol.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.Entity.Student;
import com.amol.Repository.StudentRepository;

@Service
public class StudentService implements IStudentService {

	@Autowired
	StudentRepository studentR;
	
	// ----------------- Add New Student ---------------------
	@Override
	public Student addStudent(Student student) {
		return studentR.save(student);
	}
	
	// ----------------- Get All Student ---------------------
	@Override
	public List<Student> getAllStudent() {
		return studentR.findAll();
	}
	
	// ----------------- Find Student By Id ------------------
	@Override
	public Student findStudentById(Integer id) {
		return studentR.findById(id).orElse(null);
	}
	
	// ----------------- Delete Student By Id ----------------
	@Override
	public String deleteStudentById(Integer id) {
		Student s=studentR.findById(id).orElse(null);
		if(s != null) {
			studentR.deleteById(id);
			 return "Deleted";
		}
			
		return "Not Found";
	}
	
	// ---------------- Update Student By Id -----------------
	@Override
	public String updateStudent(Student student) {
		
		Student s=studentR.findById(student.getId()).orElse(null);
		if(s != null) {
			s.setName(student.getName());
			s.setDob(student.getDob());
			s.setCast(student.getCast());
			s.setEmail(student.getEmail());
			s.setStd(student.getStd());
			s.setAddress(student.getAddress());
			 return "Updated";
		}
		
		return "Not Updated";
	}
	
	// ----------------- Update Password --------------------
	

}

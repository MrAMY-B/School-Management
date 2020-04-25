package com.amol.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amol.Entity.Student;
import com.amol.Service.StudentService;

@RestController
@CrossOrigin( origins = "*")
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	StudentService studentS;
	
	@GetMapping("students")
	public List<Student> getAllStudents(){
		return studentS.getAllStudent();
	}
	
	@GetMapping("students/{id}")
	public Student getStudentById(@PathVariable(value = "id") Integer id) {
		return studentS.findStudentById(id);
	}
	
	@PostMapping("students/add-new")
	public Student addNeawStudent(@RequestBody Student student) {
		return studentS.addStudent(student);
	}
	
	@PutMapping("students/update")
	public String updateStudent(@RequestBody Student student) {
		return studentS.updateStudent(student);
	}
	
	@DeleteMapping("students/{id}")
	public String deleteStudentById(@PathVariable(value = "id")Integer id) {
		return studentS.deleteStudentById(id);
	}

}













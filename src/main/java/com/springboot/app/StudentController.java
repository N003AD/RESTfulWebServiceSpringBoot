package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {	
	
	// http://localhost:9090/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Anta", "Diop", 25 , "Tivaone");
	}
}

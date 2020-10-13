package com.thymeleaf.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thymeleaf.entities.Student;
import com.thymeleaf.services.StudentService;

@RestController
@RequestMapping(name = "/students")
public class StudentResources {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping("/getAll")
	public String getAll() {
		List<Student> studends = service.getAll();
		return "students";
	}

}

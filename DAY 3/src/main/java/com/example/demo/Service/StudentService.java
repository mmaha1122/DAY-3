package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Database.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired 
	StudentRepo sturepo; 
	
	public Student savedata(Student s) {
		
		return sturepo.save(s); 
	}
	public List<Student> findall(){
		return sturepo.findAll();
	}	
}
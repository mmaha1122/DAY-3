package com.example.demo.Database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
    @Id
	@Column(name="id")
    @GeneratedValue
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="marks")
    private int marks;
    
    
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int id,String name,int marks) {
    	super();
    	this.id=id;
    	this.name=name;
    	this.marks=marks;
    }
	 
    public Student()
    {
    	
    }
    
    
    
}
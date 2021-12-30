package com.java.service;

import com.java.bean.Student;

public interface StudentService {
	public void addStudent(Student s);
	public Student search(int roll);
	public boolean update(int roll);
	public int delete(int roll);
	

}

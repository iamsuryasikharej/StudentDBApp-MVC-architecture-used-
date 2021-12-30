package com.java.dao;

import java.sql.Connection;

import com.java.bean.Student;
import com.java.factory.ConnectionFactory;

public class StudentDaoImpl implements StudentDao{
	private static Connection con;
	static 
	{
		con=ConnectionFactory.getConnection();
	}

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student search(int roll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(int roll) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(int roll) {
		// TODO Auto-generated method stub
		return 0;
	}

}

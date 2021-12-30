package com.java.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection con;
	private ConnectionFactory c;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentapp\",\"root\",\"******");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	private ConnectionFactory()
	{
	}
		
		public static Connection getConnection()
		{
			return con;
		}
	}



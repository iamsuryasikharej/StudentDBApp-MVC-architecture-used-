package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Controller() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
//		RequestDispatcher rd=request.getRequestDispatcher();
		if(uri.endsWith("add.do"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/add.html");
			rd.forward(request, response);
			return;
			

		}
		if(uri.endsWith("addStud.do"))
		{
			String name=request.getParameter("name");
			int roll=(int)Integer.parseInt(request.getParameter("roll"));
			RequestDispatcher rd=request.getRequestDispatcher("/lol.html");
			rd.forward(request, response);

		}
//	
	
	}

}

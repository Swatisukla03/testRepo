package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 //PrintWriter
		PrintWriter pw=resp.getWriter();
		
		//set response type
		resp.setContentType("text/html");
		
//		super.doGet(req, resp);
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		
		String qlfy=req.getParameter("qlfy");
		String[] hobbies=req.getParameterValues("hb");
		List al=Arrays.asList(hobbies);
		
		pw.println("name :"+name+"<br>");
		pw.println("dob :"+dob);
		pw.println("Gender :"+gender);
		pw.println("Qualification :"+qlfy);
		pw.print("Hobbies :"+al);
		
		pw.close();
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          doGet(req,resp);
	}

}

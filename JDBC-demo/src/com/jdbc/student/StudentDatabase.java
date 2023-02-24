package com.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class StudentDatabase {
	
	private static Connection connection=null;
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbUrl="jdbc:mysql://localhost:3306/jdbcdb";
		String username="root";
		String password="root";
		
		
		connection=DriverManager.getConnection(dbUrl,username,password);
		
		System.out.println("Enter Choice ");
		System.out.println("1. Insert record");
		int choice=Integer.parseInt(scanner.nextLine());
		switch(choice) {
		case 1:
		   
		
		}
		}catch(Exception e) {
			throw new RuntimeException("Something went Wrong ");
		}

	}
	private void insertRecord() {
		System.out.println("Insert Record ");
	}

}

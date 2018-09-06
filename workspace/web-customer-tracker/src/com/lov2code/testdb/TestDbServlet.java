package com.lov2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String user="springsstudent";
		String pass="springsstudent";
		String driver= "com.mysql.jdbc.Driver";
		try{
			PrintWriter out = response.getWriter();
			out.println(jdbcUrl);			
			Class.forName(driver);
	
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);			
			System.out.println("Success");
			myConn.close();
			
		}
		catch(Exception exp){
			exp.printStackTrace();
			throw new ServletException(exp);
		
		
	}
}}

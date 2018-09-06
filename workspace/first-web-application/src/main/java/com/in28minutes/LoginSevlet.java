package com.in28minutes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= "/login.do")
public class LoginSevlet extends HttpServlet {

	private UserValidationService userValidationService = new UserValidationService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
 
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean valid = userValidationService.isValidUser(name, password);
		if(valid){
			request.setAttribute("name", name);
			request.setAttribute("password", password);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
 }
		else{
			request.setAttribute("errorMessage", "InvalidCredentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
 }
	}
}

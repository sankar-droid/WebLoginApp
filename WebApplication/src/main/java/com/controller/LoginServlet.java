package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.model.User;
import com.service.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns="/login")//nicknames 
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserManager um=new UserManager();
    RequestDispatcher dispatcher=null;
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		User user=new User(username,password);
		boolean check=um.validateUser(user);
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		//business logic
		if(check)
		{
			 //show the positive response
			//pw.println("<h2>Success</h2>");
			dispatcher=request.getRequestDispatcher("Home.jsp");
			//key-value pair
			request.setAttribute("username",username);
			dispatcher.forward(request, response);
			
			 
			
			
		}else
		{
			 // show the negative response 
			pw.println("<span style='color:red'>Authentication failed! </span>");
			pw.println("<span style='color:red'><b>"+um.display+ "</b></span>");
			dispatcher=request.getRequestDispatcher("Index.html");
			dispatcher.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

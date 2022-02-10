package com;

import java.sql.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class commentservlet
 */
@WebServlet("/commentservlet")
public class commentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public commentservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			HttpSession session=request.getSession();
			if(session.getAttribute("session_username")==null){
				//RequestDispatcher requestdispatcher = request.getRequestDispatcher("html/signin.html");
				//requestdispatcher.include(request, response);
				response.sendRedirect("html/signin.html");  
				
			}
			else{
				RequestDispatcher requestdispatcher = request.getRequestDispatcher("/jsp/comment2.jsp");
				requestdispatcher.include(request, response);
			}
		}
		catch(Exception e)
		{
			
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

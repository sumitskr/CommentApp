package com;

import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class signinservlet
 */
@WebServlet("/signinservlet")
public class signinservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signinservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		try{
			String driver = "com.mysql.cj.jdbc.Driver" ;
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/commentapp";
			String userid = "root";
			String passwordDB = "1234";
			con = DriverManager.getConnection(url,userid,passwordDB);

			
			stmt = con.createStatement();
			String query = "SELECT * FROM USERDATABASE WHERE USERNAME=('"+username+"') AND PASSWORD=('"+password+"')";
			rs=stmt.executeQuery(query);
			if(rs.next()){
				String session_username = rs.getString("username");
				HttpSession session=request.getSession();  
				session.setAttribute("session_username", session_username);
				response.sendRedirect("comment");
			}
			
			else{
				response.sendRedirect("jsp/error.jsp");
			}
			con.close();
		}
		catch(Exception e){
			System.out.print(e);
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

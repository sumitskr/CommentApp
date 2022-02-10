package com;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showallcomennts
 */
@WebServlet("/showallcomennts")
public class showallcomennts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showallcomennts() {
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
		PrintWriter out = response.getWriter();
		try{
			String driver = "com.mysql.jdbc.Driver" ;
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/commentapp";
			//String database = "commentapp";
			String userid = "root";
			String passwordDB = "1234";
			con = DriverManager.getConnection(url,userid,passwordDB);

			
			stmt = con.createStatement();
			String query = "SELECT * FROM COMMENTS";
			rs=stmt.executeQuery(query);
			while(rs.next()){
				out.print("----------------------------"+"<br>");
				out.print("<h3>"+rs.getString("USERNAME")+"</h3>"+" : "+rs.getString("COMMENT")+"<br>");
			}
			con.close();
		}
		catch(Exception e)
		{
			out.print(e);
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

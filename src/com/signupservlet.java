package com;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/signupservlet")
public class signupservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String secret = request.getParameter("secret");
	
		try{
			String driver = "com.mysql.jdbc.Driver" ;
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/commentapp";
			//String database = "commentapp";
			String userid = "root";
			String passwordDB = "1234";
			con = DriverManager.getConnection(url,userid,passwordDB);

			
			stmt = con.createStatement();
			String query = "INSERT INTO USERDATABASE (USERNAME,PASSWORD,SECRET) VALUES ('"+username+"','"+password+"','"+secret+"')";
			int rn=stmt.executeUpdate(query);
			if(rn>0){
				response.sendRedirect("/CommentApp/html/signin.html");
			}
			else{
				response.sendRedirect("jsp/error2.jsp");
			}
			con.close();
			
		}
		catch(Exception e){
			System.out.print(e);
			response.sendRedirect("jsp/error2.jsp");
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

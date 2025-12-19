package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("<body><html>");
		
		String uname = request.getParameter("t1");
		String pwd = request.getParameter("t2");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root", "root@2002");
			
			PreparedStatement pst = con.prepareStatement("select * from user where uname =? and pwd=?");
			pst.setString(1, uname);
			pst.setString(2, pwd);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				out.println("<h1> Welcome  ::"+uname+"</h1>");
			}
			else
			{
				out.println("<h1>Login Failed!!!!!");
			}
			
			out.close();
			rs.close();
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}

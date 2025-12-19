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


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String uid = request.getParameter("t1");
		String pwd = request.getParameter("t2");
		
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root", "root@2002");
			
			PreparedStatement pst = con.prepareStatement("select  uid=? and pwd=? from userinfo");
			pst.setString(1,uid);
			pst.setString(2,pwd);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				out.println("<h1>Welcome : "+uid+"</h1>");
			}
			else
			{	
				String uname =request.getParameter("t3");
				String addrs=request.getParameter("t4");
				String cno =request.getParameter("t5");
				PreparedStatement pst1 = con.prepareStatement("insert into userinfo values(?,?,?,?,?)");
				pst1.setString(1,uid);
				pst1.setString(2,pwd);				
				pst1.setString(3,uname);
				pst1.setString(4,addrs);
				pst1.setString(5,cno);
				out.println("Registration Sucessfuly...........");
			
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

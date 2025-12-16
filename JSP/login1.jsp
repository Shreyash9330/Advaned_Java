<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		

<%
		String s1 =request.getParameter("t1");
		String  s2 =request.getParameter("t2");
		
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","root@2002");
		
		PreparedStatement pst =con.prepareStatement("select * from user where uname =?  and pwd=?");
		pst.setString(1,s1);
		pst.setString(2,s2);
		
		ResultSet rs = pst.executeQuery();
		if(rs.next())
		{
%>		
<h1>Welcome <%= s1 %></h1>
	<%
			}
			else
			{
	 			%>		
	 			<h1>Login Failed!!!!!!!!</h1>
				
				<% 	
				}
				rs.close();
				con.close();
				}
					catch(Exception ex)
				{
				System.out.println(ex);
				}
			%>

</body>
</html>
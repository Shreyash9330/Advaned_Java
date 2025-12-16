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

<table border="1"  align="center" width = "50%">
<tr>
	  <th>ID</th>	
	  <th>Name</th>
	  <th>City</th>
</tr>

<%
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","root@2002");

    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from student");

    while(rs.next()) {
%>
<tr>
    <td><%= rs.getString(1) %></td>
    <td><%= rs.getString(2) %></td>
    <td><%= rs.getString(3) %></td>
    
</tr>
<%
    }
    con.close();
%>

</table>

</body>
</html>


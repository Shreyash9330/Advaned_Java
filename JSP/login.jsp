<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
		<%!
			int num = 10;
		int square(int n)
		{
			return(n*n);
		}
			%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("<h1> num ="+num+" <h1>");
%>
<h1>num = <%=num %> </h1>
<h1>Square <%=square (num) %></h1>
	
</body>
</html>
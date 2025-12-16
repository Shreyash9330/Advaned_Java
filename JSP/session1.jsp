<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String s1 = request.getParameter("t1");
	session.setAttribute("uname", s1);
%>
	<h3>Session is Created.......</h3>
	<a href="session2.jsp">Click</a>	
</body>
</html>
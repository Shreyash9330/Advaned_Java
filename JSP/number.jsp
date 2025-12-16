<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file ="login.html"%>
<%
	int n1 =Integer.parseInt(request.getParameter("num1"));
	int n2 =Integer.parseInt(request.getParameter("num2"));
	int n=n1/n2;
	out.println("Div "+n);
%>
</body>
</html>
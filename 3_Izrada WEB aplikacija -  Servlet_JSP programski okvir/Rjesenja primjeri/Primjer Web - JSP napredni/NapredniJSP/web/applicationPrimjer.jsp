<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<title>Primjer korištenja implicitne varijable application</title>
</head>
<body>
	Ova aplikacija koristi
	<%=application.getInitParameter("jezik")%>
	jezik!
</body>
</html>

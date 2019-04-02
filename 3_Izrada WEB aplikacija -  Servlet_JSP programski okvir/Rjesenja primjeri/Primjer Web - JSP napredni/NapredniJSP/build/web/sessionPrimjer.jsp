<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<title>Primjer korištenja implicitne varijable session</title>
</head>
<body>
	Pozdrav, upisali ste smjer:
	<%=session.getAttribute("smjerStudija")%>
</body>
</html>


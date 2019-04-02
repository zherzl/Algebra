<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<body>
	<%
		int port = request.getLocalPort();
	%>
	Dobro došli! Port na kojem se izvršava aplikacija:
	<%=port%>.
</body>
</html>

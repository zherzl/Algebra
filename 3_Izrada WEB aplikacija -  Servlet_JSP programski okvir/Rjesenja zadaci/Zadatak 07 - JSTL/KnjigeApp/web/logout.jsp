<%-- 
    Document   : logout
    Created on : Aug 15, 2018, 3:59:04 PM
    Author     : zlatko.herzl
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Odjava</title>
    </head>
    <body>
    
        <p>Before remove: <c:out value="${uid}"/></p>
        <c:remove var="uid" scope="session"/>
        <p>After remove: <c:out value="${uid}"/></p>
        ${uid}
<h1>Uspješno ste odlogirani</h1>
<a href="login.jsp">Prijava</a>
</body>
</html>

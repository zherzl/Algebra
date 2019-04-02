
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Core primjer</title>
    </head>
    <body>
        <%
            session.setAttribute("user", "Pero");
            application.setAttribute("user", "Ana");
        %>
        
        User u session dosegu:
        <%= session.getAttribute("user") %> <br/>
        User u application dosegu:
        <%= application.getAttribute("user") %> <br/>
        
        <c:set value="Mirko" var="user" scope="application" />
        
        User u session dosegu:
        <%= session.getAttribute("user") %> <br/>
        User u application dosegu:
        <%= application.getAttribute("user") %> <br/>
        
        <c:remove scope="application" var="user" />
        
        User u session dosegu:
        <%= session.getAttribute("user") %> <br/>
        User u application dosegu:
        <%= application.getAttribute("user") %> <br/>
        
    </body>
</html>

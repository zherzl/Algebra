<%@page import="java.time.LocalTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP primjer</title>
    </head>
    <body>
        <h1><%= LocalTime.now() %></h1>
    </body>
</html>

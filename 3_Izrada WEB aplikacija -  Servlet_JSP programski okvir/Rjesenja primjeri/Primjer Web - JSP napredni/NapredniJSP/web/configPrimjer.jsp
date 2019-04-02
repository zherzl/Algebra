<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Primjer korištenja implicitne varijable config</title>
    </head>
    <body>
        Trenutni tečaj je:
        <%=config.getInitParameter("tecaj")%>
    </body>
</html>


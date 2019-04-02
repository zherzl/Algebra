
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zbroj pomoću akcije include</title>
    </head>
    <body>
        <jsp:include page="/ZbrojServlet">
            <jsp:param name="prvi" value="4" />
            <jsp:param name="drugi" value="7" />
        </jsp:include>
    </body>
</html>

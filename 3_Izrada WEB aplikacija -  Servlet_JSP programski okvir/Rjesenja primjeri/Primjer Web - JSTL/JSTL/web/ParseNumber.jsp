
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSTL FMT Parse Number Primjer</h1>
        <hr/>

        <!--http://localhost:8080/JSTL/ParseNumber.jsp?unos=123.77-->
        <fmt:parseNumber type="number" value="${param.unos}" parseLocale="en_US"/>

    </body>
</html>

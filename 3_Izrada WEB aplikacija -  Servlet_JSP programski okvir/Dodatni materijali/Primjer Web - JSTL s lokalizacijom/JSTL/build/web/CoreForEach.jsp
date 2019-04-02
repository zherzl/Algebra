

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int[] poljeZaPrimjer = new int[10];
            for (int i = 0; i < 10; i++) {
                poljeZaPrimjer[i] = i + 1;
            }
            session.setAttribute("brojeviDoDeset", poljeZaPrimjer);
        %>

        Parni brojevi:
        <br/>

        <c:forEach var="i" items="${brojeviDoDeset}" begin="1" step="2">
            <c:out value="${i}"/>
        </c:forEach>
        <br/>
        <br/>
        Brojevi djeljivi s 5 :
        <br/>

        <c:forEach var="i" items="${brojeviDoDeset}" begin="4" step="5">
            <c:out value="${i}"/>
        </c:forEach>

    </body>
</html>

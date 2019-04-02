

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <c:set value="4" var="ocjena" scope="session"/>
    Vrijednost variable ocjena je: <c:out value="ocjena"/>
    <br/>
    <c:set value="<b>Sadržaj</b>" var="ispis1" scope="session"/>
    Vrijednost variable ispis1 je: <c:out value="${ispis1}" />
    <br/>
    Vrijednost variable ispis1 je: <c:out value="${ispis1}" escapeXml="false"/>
    <br/>

    Vrijednost variable ispis2 je: <c:out value="${ispis2}" />
    <br/>
    Vrijednost variable ispis2 je: <c:out value="${ispis2}" default="varijabla nije pronađena"/>
    <br/>

</body>
</html>

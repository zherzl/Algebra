
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<%@page import="java.util.Calendar"%><html>
    <head>
        <title>JSTL FMT Format date primjer</title>
    </head>
    <body>

        <H1>Primjeri formatiranja datuma i vremena</H1>
        <hr/>

        <% session.setAttribute("now", Calendar.getInstance().getTime());%>
        <br/>

        engleski locale:  
        <fmt:setLocale value="en_US"/>
        <fmt:formatDate value="${now}" type="both"/>
        <br/>

        hrvatski locale:  
        <fmt:setLocale value="hr_HR"/>
        <fmt:formatDate value="${now}" type="both"/>
        <br/>

        hrvatski locale - samo datum:  
        <fmt:setLocale value="hr_HR"/>
        <fmt:formatDate value="${now}" type="date"/>
        <br/>

        hrvatski locale – definirani stil datuma:  
        <fmt:setLocale value="hr_HR"/>
        <fmt:formatDate value="${now}" type="date" dateStyle="long"/>
        <br/>

        hrvatski locale – definirani stil vremena:  
        <fmt:setLocale value="hr_HR"/>
        <fmt:formatDate value="${now}" type="time" timeStyle="long"/>
        <br/>

    </body>
</html>

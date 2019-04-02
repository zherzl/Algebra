<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Timezones</title>
    </head>
    <body>
        <% if (session.getAttribute("uid") == null) {
                response.sendRedirect("login.jsp");
            }
        %>
        <c:set var = "now" value = "<%= (new java.util.Date())%>" />
        <c:set var = "zona" value="${param['z']}" />
        <br>
        <form action="">
            <select name="z" onchange="this.form.submit()"> 
                <option value="${zona}" selected>${zona}</option>
                <c:forEach var="zoneId" items="<%= java.util.TimeZone.getAvailableIDs()%>">
                    <option value="${zoneId}">${zoneId}</option>
                </c:forEach>
            </select>
        </form>

        <!-- fmt:setLocale value="en_US" /-->
        <fmt:setLocale value="hr_HR" />

        <fmt:formatDate value = "${now}" timeZone = "Europe/Zagreb" type = "both" timeStyle="long" dateStyle="long"/>
        <br>
        <fmt:formatDate value = "${now}" timeZone = "${zona}" type = "both" timeStyle="long" dateStyle="long"/>
        <br><br>
        <a href="Home"><< Početna</a>
        <br>  
    </body>
</html>


<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<%@page import="java.util.Calendar"%><html>
    <head>
        <title>JSTL FMT Format Number Primjer</title>
    </head>
    <body>
        <H1>Primjeri parsiranja datuma i vremena</H1>
        <hr/>
        <%
            Date date = new java.util.Date();
            pageContext.setAttribute("date", date);
        %>

    <table border="1" width="70%">
        <tr>
            <td width="100%" colspan="2" bgcolor="#1C1C1C">
                <p align="center"><b><font color="#D8D8D8" size="4">Format:
                        <fmt:formatDate value="${date}" type="both" timeStyle="long"
                                        dateStyle="long"/></font></b></p>
            </td>
        </tr>
        <tr>
            <td width="51%">Atribut : type="date"</td>
            <td width="49%"><fmt:formatDate type="date" value="${date}" /></td>
        </tr>
        <tr>
            <td width="51%">Atribut : type="time"</td>
            <td width="49%"><fmt:formatDate type="time" value="${date}" /></td>
        </tr>
        <tr>
            <td width="51%">Atribut : type="both"</td>
            <td width="49%"><fmt:formatDate type="both" value="${date}" /></td>
        </tr>
        <tr>
            <td width="51%">Atribut : type="both"
                dateStyle="default" timeStyle="default"</td>
            <td width="49%"><fmt:formatDate type="both" dateStyle="default"
                            timeStyle="default" value="${date}" /></td>
        </tr>
        <tr>
            <td width="51%">Atribut : type="short"
                dateStyle="default" timeStyle="short"</td>
            <td width="49%"><fmt:formatDate type="both" dateStyle="short"
                            timeStyle="short" value="${date}" /></td>
        </tr>
        <tr>
            <td width="51%">Atribut : type="both"
                dateStyle="medium" timeStyle="medium"</td>
            <td width="49%"><fmt:formatDate type="both" dateStyle="medium"
                            timeStyle="medium" value="${date}" /></td>
        </tr>
        <tr>
            <td width="51%">Atribut : type="both"
                dateStyle="long" timeStyle="long"</td>
            <td width="49%"><fmt:formatDate type="both" dateStyle="long"
                            timeStyle="long" value="${date}" /></td>
        </tr>
        <tr>
            <td width="51%">Atribut : type="both"
                dateStyle="full" timeStyle="full"</td>
            <td width="49%"><fmt:formatDate type="both" dateStyle="full"
                            timeStyle="full" value="${date}" /></td>
        </tr>
        <tr>
            <td width="51%">Atribut : pattern="yyyy-MM-dd"</td>
            <td width="49%"><fmt:formatDate pattern="yyyy-MM-dd"
                            value="${date}" /></td>
        </tr>
        <tr>
            <td width="51%">Atribut : pattern="yyyy-MM-dd hh:mm:ss"</td>
            <td width="49%"><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss"
                            value="${date}" /></td>
        </tr>
    </table>


</body>
</html>

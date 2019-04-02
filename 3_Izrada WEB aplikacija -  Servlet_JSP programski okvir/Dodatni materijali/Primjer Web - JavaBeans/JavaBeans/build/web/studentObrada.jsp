<%@page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@page import="com.beans.example.StudentBean"%>
<jsp:useBean id="noviStudent" class="com.beans.example.StudentBean" scope="session"/>
<jsp:setProperty name="noviStudent" property="*"/>

<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
        <title>Obrada novog studenta</title>
    </head>
    <body>
        Uspješno su zaprimljeni podaci studenta:
        <hr>
        Ime:
        <jsp:getProperty name="noviStudent" property="ime"/><br>
        Prezime:
        <jsp:getProperty name="noviStudent" property="prezime"/><br>
        Godina studija:
        <jsp:getProperty name="noviStudent" property="godinaStudija"/><br>
        Matični broj:
        <jsp:getProperty name="noviStudent" property="matBroj"/><br>
    </body>
</html>

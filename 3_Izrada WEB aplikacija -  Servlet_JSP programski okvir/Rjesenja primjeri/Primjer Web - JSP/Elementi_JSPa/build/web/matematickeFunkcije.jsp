<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matematičke funkcije</title>
    </head>
    <body>
        <h1>Tablica vrijednosti funkcija ln(x) i e<sup>x</sup></h1>
        <table border="1">
            <tr>
                <th>x</th>
                <th>ln(x)</th>
                <th>e<sup>x</sup></th>
            </tr>
            <% for (int x = 1; x <= 10; x++) { %>
            <tr>
                <td><%= x %></td>
                <td><%= Math.log(x) %></td>
                <td><%= Math.exp(x) %></td>
            </tr>
            <% }%>
        </table>
    </body>
</html>

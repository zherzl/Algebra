<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Brojač posjeta</title>
    </head>
    <body>
        <% // Java komentar %>
        <%-- JSP komentar --%>
        <%! private int brojacPosjeta = 0;

            private void povecajBrojac() {
                brojacPosjeta++;
            }
        %>
        <!-- HTML komentar -->
        <% povecajBrojac(); %>
            
        <h1>Dobrodošli, Vi ste <%= brojacPosjeta %> posjetitelj</h1>
    </body>
</html>

<%-- 
    Document   : login
    Created on : Aug 15, 2018, 1:33:17 PM
    Author     : zlatko.herzl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% if (session.getAttribute("uid") != null) {
                response.sendRedirect("home.jsp");
            }%>

        <form action="Login" method="POST">
            <table>
                <tr>
                    <td>Username</td>
                    <td>
                        <input type="text" name="uid" placeholder="Upišite username" required="true" />
                    </td>

                </tr>
                <tr>
                    <td>
                        Lozinka
                    </td>
                    <td>
                        <input type="password" name="pwd" placeholder="Upišite password" required="true" />            
                    </td>
                </tr>
            </table>

            <input type="submit" value="Prijava" />
            
        </form>
    </body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Core formatting</title>
    </head>
    <body>
    <fmt:setLocale value="es"/>
    <fmt:setBundle basename="resources.tekstovi"/>

    <form>
        <table border="1">
            <tr>
                <td><fmt:message key="name" /> </td>
                <td><input type="text" size="16"> </td>
            </tr>
            
            <tr>
                <td> <fmt:message key="surname"/> </td>
                <td> <input type="text" size="16"> </td>
            </tr>
            <tr>
                <td> <fmt:message key="dob" /> </td>
                <td> <input type="text" size="16"> </td>
            </tr>
            <tr>
                <td> </td>
                <td> <input type="submit" value='<fmt:message key="submit"/>' </td>
            </tr>
        </table>
    </form>
</body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL implicitne varijable</title>
    </head>
    <body>
        <h1>Pristup implicitnim varijablama</h1>
        <p>
        <ul>
            <li><b>ime:</b> ${ime} </li>
            <li><b>prezime:</b> ${prezime} </li>
            <li><b>datum</b> ${datum} </li>
            <li><b>Boja:</b> ${boja} </li>
            <li><b>Boja:</b> ${sessionScope.boja} </li>
        </ul>

    </body>
</html>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL pristup kolekcijama</title>
    </head>
    <body>
        <h1>EL pristup kolekcijama</h1>
        <ul>
            <li><b>Prvi grad:</b> ${gradovi[0]}</li>
            <li><b>Drugi kvart:</b> ${kvartovi[1]}</li>
            <li><b>Registracija KR:</b> ${rege.KR}</li>
            <li><b>Registracija ZG:</b> ${rege["ZG"]}</li>
        </ul>
    </body>
</html>

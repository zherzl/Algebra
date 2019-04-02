<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Izbornik</title>
        <jsp:include page="statickiSadrzaj.jsp" />
    </head>
    <body>
        <jsp:include page="korisnik.jsp" />
        <h1>Odaberite opciju</h1>
        <a href="NoviStudent">Kreiranje novog studenta</a> &nbsp; | &nbsp;
        <a href="IspisStudenata">Ispis studenata</a>
    </body>
</html>

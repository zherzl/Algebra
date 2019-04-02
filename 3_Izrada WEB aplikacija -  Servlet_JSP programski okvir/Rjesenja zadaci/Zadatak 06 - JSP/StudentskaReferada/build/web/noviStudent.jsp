
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novi student</title>
        <jsp:include page="statickiSadrzaj.jsp" />
    </head>
    <body>
        <jsp:include page="korisnik.jsp" />
        <h1>Unos novog studenata</h1>

        <form action="NoviStudent" method="POST">
            <label>Ime</label> <br/>
            <input type="text" value="" name="ime"/>
            <br/>
            <label>Prezime</label> <br/>
            <input type="text" value="" name="prezime"/>
            <br/>
            <label>Godina studija</label> <br/>
            <input type="number" value="" name="godina"/>
            <br/>
            <label>JMBAG</label> <br/>
            <input type="text" value="" name="jmbag"/>
            <br/>
            <br/>
            <input type="submit" value="Unesi" />    
        </form>

        <a href="izbornik.jsp">Povratak na izbornik</a>
    </body>
</html>

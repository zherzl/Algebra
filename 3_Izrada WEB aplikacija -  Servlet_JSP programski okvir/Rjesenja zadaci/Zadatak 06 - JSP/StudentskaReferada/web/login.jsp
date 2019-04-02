<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <jsp:include page="statickiSadrzaj.jsp" />
    </head>
    <body>
        <jsp:include page="korisnik.jsp" />
        <h1>Prijava korisnika</h1>
        <form method="POST" action="Login">
            <label>Korisničko ime</label> <br/>
            <input type="text" value="" name="username"/>
            <br/>
            <label>Lozinka</label> <br/>
            <input type="password" value="" name="password"/>
            <br/>
            <input type="submit" value="Prijava" />
        </form>
    </body>
    
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="statickiSadrzaj.jsp" />
        <title>Studenti</title>
        <style>
            ol li {
                font-size: 24px;
            }
            table {
                border: 1px solid #ccc;
            }
            table th {
                border-bottom: 1px solid #ccc;
            }
            table td {
                border-right: 1px solid #ccc;
            }
        </style>
    </head>
    <body>
        <jsp:include page="korisnik.jsp" />
        <h1>Pregled studenata</h1>

        <table id="listaStudenata">
            <thead>
                <tr>
                    <th>Ime</th>
                    <th>Prezime</th>
                    <th>Godina studija</th>
                    <th>JMBAG</th>
                </tr>
            </thead>
            <tbody ></tbody>
        </table>
        <a href="izbornik.jsp">Povratak na izbornik</a>
        
        <script src="skripte/studenti.js" type="text/javascript"></script>
    </body>
    
</html>

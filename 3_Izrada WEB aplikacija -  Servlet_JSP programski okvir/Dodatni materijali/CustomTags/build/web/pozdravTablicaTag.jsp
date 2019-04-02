

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="jtag" uri="http://www.nekiserver.com/mojabiblioteka" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Custom Tag Pozdrav</title>
    </head>
    <body>
        <div>
            <!-- POZDRAV TAG -->
            <h1><jtag:PozdravTag /></h1>
        </div>

        <div>
            <!-- HTMLTablica TAG -->
            Tablica pomoću taga:
            <jtag:HTMLTablicaTag brKolona="5" brRedaka="10" />
        </div>


    </body>
</html>

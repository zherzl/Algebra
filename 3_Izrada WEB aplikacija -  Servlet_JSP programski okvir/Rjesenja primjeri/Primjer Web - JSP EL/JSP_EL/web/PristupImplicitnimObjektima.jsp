<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL pristup implicitnim objektima</title>
    </head>
    <body>
        <h1>EL pristup implicitnim objektima</h1>
        <ul>
            <li><b>session id:</b> ${pageContext.session.id}</li>
            <li><b>parameter test:</b> ${param.test}</li>
            <li><b>header host:</b> ${header.Host}</li>
            <li><b>cookie session id:</b> ${cookie.JSESSIONID.value}</li>
            <li><b>test init param:</b> ${initParam.testInitParam}</li>
        </ul>
    </body>
</html>

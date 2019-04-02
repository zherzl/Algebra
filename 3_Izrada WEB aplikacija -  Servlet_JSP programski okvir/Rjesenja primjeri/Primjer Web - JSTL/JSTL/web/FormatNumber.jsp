
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Primjeri formatiranja numeričkih vrijednosti</h1>
        <hr/>

        <c:set var="tisucuPi" value="3141.592645" scope="session"/>
        Originalni broj: ${tisucuPi}
        <br/>
        engleski locale (zaokružuje na 3 decimale - default): 
        <fmt:setLocale value="en_us"/>
        <fmt:formatNumber value="${tisucuPi}" />
        <br/>

        francuski locale (zaokružuje na 3 decimale - default): 
        <fmt:setLocale value="fr_fr"/>
        <fmt:formatNumber value="${tisucuPi}" />
        <br/>

        engleski locale (zaokružuje na 4 decimale): 
        <fmt:setLocale value="en_us"/>
        <fmt:formatNumber value="${tisucuPi}" maxFractionDigits="4"/>
        <br/>

        engleski locale (valuta): 
        <fmt:setLocale value="en_us"/>
        <fmt:formatNumber value="${tisucuPi}" maxFractionDigits="4" type="currency"/>
        <br/>

        hrvatski locale (valuta): 
        <fmt:setLocale value="hr_hr"/>
        <fmt:formatNumber value="${tisucuPi}" maxFractionDigits="2" type="currency" groupingUsed="false"/>
        <br/>

        hrvatski locale (postotak): 
        <fmt:setLocale value="hr_hr"/>
        <fmt:formatNumber value="${tisucuPi}" maxFractionDigits="2" type="percent" groupingUsed="false"/>
        <br/>

    </body>
</html>


<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<%@page import="java.util.Calendar"%><html>
    <head>
        <title>JSTL Functions primjer</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${param.radioBtnGroup=='uCaseOp'}">
                Ulazni niz : Visoka škola zaprimijenjeno računarstvo - Java Web Programiranje
                <br/>
                UpperCase : ${fn:toUpperCase('Visoka škola za primijenjeno računarstvo - Java Web Programiranje')}
            </c:when>
            <c:when test="${param.radioBtnGroup=='lCaseOp'}">
                Ulazni niz  : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
                <br/>
                Lowercase : ${fn:toLowerCase('Visoka škola za primijenjeno računarstvo - Java Web Programiranje')}
            </c:when>
            <c:when test="${param.radioBtnGroup=='subStrOp'}">
                Ulazni niz  : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
                <br/>
                Substring(ulazni,4,7) : ${fn:substring('Visoka škola za primijenjeno računarstvo - Java Web Programiranje',4,7)}
            </c:when>
            <c:when test="${param.radioBtnGroup=='subStrAfterOp'}">
                Ulazni niz  : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
                <br/>
                Substring After	"škola" : ${fn:substringAfter('Visoka škola za primijenjeno računarstvo - Java Web Programiranje','škola')}
            </c:when>
            <c:when test="${param.radioBtnGroup=='subStrBeforeOp'}">
                Ulazni niz  : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
                <br/>
                Substring Before "škola" : ${fn:substringBefore('Visoka škola za primijenjeno računarstvo - Java Web Programiranje','škola')}
            </c:when>
            <c:when test="${param.radioBtnGroup=='trimOp'}">
                Ulazni niz :    Visoka škola za primijenjeno računarstvo - Java Web Programiranje
                <br/>
                Trim : ${fn:trim(' Visoka škola za primijenjeno računarstvo - Java Web Programiranje ')}
            </c:when>
            <c:when test="${param.radioBtnGroup=='replaceOp'}">
                Ulazni niz : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
                <br/>
                Replace(ulazni,'a','A') : ${fn:replace('Visoka škola za primijenjeno računarstvo - Java Web Programiranje','a','A')}
            </c:when>
            <c:when test="${param.radioBtnGroup=='splitOp'}">
                Ulazni niz : Visoka škola za primijenjeno računarstvo; Java Web Programiranje
                <br/>
                Split Separator : ";"
                <br/>
                Nakon poziva metode fn:split kreirano je polje sa 2 elementa: 
                <br/>
                polje[0] : ${fn:split('Visoka škola za primijenjeno računarstvo; Java Web Programiranje',';')[0]}
                <br/>
                polje[1] : ${fn:split('Visoka škola za primijenjeno računarstvo; Java Web Programiranje',';')[1]}
            </c:when>
            <c:when test="${param.radioBtnGroup=='joinOp'}">
                Ulazni niz : Visoka škola za primijenjeno računarstvo; Java Web Programiranje
                <br/>
                Split Separator : ";"
                <br/>
                Join Separator : "|"
                <br/>
                Join :
                <c:set var="a1" value="${fn:split('Visoka škola za primijenjeno računarstvo; Java Web Programiranje', ';')}"  />
                <c:out value="${fn:join(a1, '|')}" />
            </c:when>
            <c:when test="${param.radioBtnGroup=='escapeXml'}">
                Ulazni niz : <B>Visoka škola za primijenjeno računarstvo - Java Web Programiranje</B>
                <br/>
                escapeXML ignorira značenje taga &lt;B&gt; i prikazuje ga: </b>${fn:escapeXml('<B>Visoka škola za primijenjeno računarstvo - Java Web Programiranje</B>')}	
            </c:when>
            <c:when test="${param.radioBtnGroup=='indexOf'}">
            Ulazni niz : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
            <br/>
            Index od "škola" : ${fn:indexOf('Visoka škola za primijenjeno računarstvo - Java Web Programiranje','škola')}
            <br/>
        </c:when>
        <c:when test="${param.radioBtnGroup=='startsWithOp'}">
            Ulazni niz  : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
            <br/>
            Starts With "Visoka" : ${fn:startsWith('Visoka škola za primijenjeno računarstvo - Java Web Programiranje','Visoka')}
        </c:when>
        <c:when test="${param.radioBtnGroup=='endsWithOp'}" >
            Ulazni niz : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
            <br/>
            Ends With "ola" : ${fn:endsWith('Visoka škola za primijenjeno računarstvo - Java Web Programiranje','ola')}
            </c:when>
            <c:when test="${param.radioBtnGroup=='containsOp'}">
                Ulazni niz : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
                <br/>
                Contains "škola" : ${fn:contains('Visoka škola za primijenjeno računarstvo - Java Web Programiranje','škola')}
            </c:when>
            <c:when test="${param.radioBtnGroup=='containsIgnoreCaseOp'}">
                Ulazni niz : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
                <br/>
                Contains IgnoreCase "WEB" : ${fn:containsIgnoreCase('Visoka škola za primijenjeno računarstvo - Java Web Programiranje','WEB')}
            </c:when>
            <c:when test="${param.radioBtnGroup=='lengthOp'}">
                Ulazni niz : Visoka škola za primijenjeno računarstvo - Java Web Programiranje
                <br/>
                Duljina niza : ${fn:length('Visoka škola za primijenjeno računarstvo - Java Web Programiranje')}
            </c:when>
            <c:otherwise>
                Odaberi operaciju:
            </c:otherwise>
    </c:choose>

    <br/><br/>
    <a href="FunctionsOdabir.jsp">Nazad na odabir operacije</a>

</body>
</html>

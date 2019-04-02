
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <style type="text/css">
            .div1 {
                display: inline-block;
                max-width: 30%;
                /*                border: 1px solid yellowgreen;*/
                margin-right: 15px;
            }
            .div * {
                max-width: 80%;
            }
        </style>

    </head>
    <body>
        <% if (session.getAttribute("uid") == null) {
                response.sendRedirect("login.jsp");
            }%>

        <c:if test="${uid.length() > 0}">
            <h2>Pozdrav, ${uid}</h2>
            <ul>
                <li><a href="logout.jsp"><h3>Odjava</h3></a></li>
                <li><a href="TimeZones"><h3>TimeZones</h3></a></li>
            </ul>
            
        </c:if>

        <div class="div1">
            <fmt:setLocale value="hr_hr"/>
            <h2>Sve knjige</h2>
            <table border="1" cellpadding="5">
                <thead>
                    <tr>
                        <th>Naziv</th>
                        <th>Autor</th>
                        <th>Cijena</th>
                    </tr>

                </thead>
                <tbody>
                    <c:forEach items="${knjige}" var="k">
                        <tr>
                            <td >${k.getNaziv()}</td>
                            <td >${k.getAutor()}</td>
                            <td align="right"><fmt:formatNumber value="${k.getCijena()}" maxFractionDigits="2" minFractionDigits="2" type="currency"  /> </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="div1">
            <h2>Najskuplji autori</h2>
            <table border="1" cellpadding="5">
                <thead>
                    <tr>
                        <th>Autor</th>
                        <th>Cijena</th>
                    </tr>

                </thead>
                <tbody>
                    <c:forEach items="${knjige}" var="k">
                        <c:if test="${k.getCijena() > 100}">
                            <tr>
                                <td >${k.getAutor()}</td>
                                <td align="right"><fmt:formatNumber value="${k.getCijena()}" maxFractionDigits="2" minFractionDigits="2" type="currency"  /> </td>
                            </tr>
                            </if>

                        </c:if>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="div1">
            <h2>Najjeftiniji naslovi</h2>
            <table border="1" cellpadding="5">
                <thead>
                    <tr>
                        <th>Naziv</th>
                        <th>Cijena</th>
                    </tr>

                </thead>
                <tbody>
                    <c:forEach items="${knjige}" var="k">
                        <c:if test="${k.getCijena() < 100}">
                            <tr>
                                <td > ${fn:toUpperCase(k.getNaziv())} </td>
                                <td align="right"><fmt:formatNumber value="${k.getCijena()}" maxFractionDigits="2" minFractionDigits="2" type="currency"  /> </td>
                            </tr>
                            </if>

                        </c:if>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

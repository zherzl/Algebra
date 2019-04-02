
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Core primjer</title>
        <style>
            .nedovoljan {
                color: red;
            }
            .prolaz{
                color:green;
            }
            .nedefinirano {
                color: blue;
            }
        </style>
    </head>
    <body>
        <!--JSTL Core if-->
        <c:set value="75" var="brStudenata" scope="page" />
        <c:if test="${ brStudenata >= 50}" >
            Broj studenata je veći ili jednak 50!
        </c:if>

        <br/>
        <!--JSTL Core Choose -->
        <c:set value="1" var="ocjena" scope="session" />
        <c:choose>
            <c:when test="${ ocjena == 1}">
                Ocjena je <span class="nedovoljan">Nedovoljan</span>
            </c:when>
            <c:when test="${ ocjena == 2}">
                Ocjena je <span class="prolaz">Dovoljan</span>
            </c:when>

            <c:when test="${ ocjena == 3}">
                Ocjena je <span class="prolaz">Dobar</span>
            </c:when>
            <c:when test="${ ocjena == 4}">
                Ocjena je <span class="prolaz">Vrlo dobar</span>
            </c:when>
            <c:when test="${ ocjena == 5}">
                Ocjena je <span class="prolaz">Izvrstan</span>
            </c:when>
            <c:otherwise>
                <span class="nedefinirano">Ocjena neispravna</span>
            </c:otherwise>
        </c:choose>
    </body>
</html>

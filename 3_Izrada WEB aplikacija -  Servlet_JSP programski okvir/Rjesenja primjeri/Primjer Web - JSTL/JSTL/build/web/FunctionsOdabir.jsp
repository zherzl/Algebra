
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
        <form name="myForm" method="post" action="FunctionsView.jsp">
            Odaberioperaciju i klikni gumb:<br/><br/>
            <input type="radio" name="radioBtnGroup" value="uCaseOp"/>toUpperCase()<br/>
            <input type="radio" name="radioBtnGroup" value="lCaseOp"/>toLowerCase()<br/>
            <input type="radio" name="radioBtnGroup" value="subStrOp"/>substring()<br/>
            <input type="radio" name="radioBtnGroup" value="subStrAfterOp"/>substringAfter()<br/>
            <input type="radio" name="radioBtnGroup" value="subStrBeforeOp"/>substringBefore()<br/>
            <input type="radio" name="radioBtnGroup" value="trimOp"/>trim()<br/>
            <input type="radio" name="radioBtnGroup" value="replaceOp"/>replace()<br/>
            <input type="radio" name="radioBtnGroup" value="splitOp"/>split()<br/>
            <input type="radio" name="radioBtnGroup" value="joinOp"/>join()<br/>
            <input type="radio" name="radioBtnGroup" value="escapeXml"/>escapeXML()<br/>
            <input type="radio" name="radioBtnGroup" value="indexOf"/>indexOf()<br/>
            <input type="radio" name="radioBtnGroup "value="startsWithOp"/>startsWith()<br/>
            <input type="radio" name="radioBtnGroup" value="endsWithOp"/>endsWith()<br/>
            <input type="radio" name="radioBtnGroup" value="containsOp"/>contains()<br/>
            <input type="radio" name="radioBtnGroup" value="containsIgnoreCaseOp"/>containsIgnoreCase()<br/>
            <input type="radio" name="radioBtnGroup" value="lengthOp"/>length()<br/>
            <br/>
            <input type="Submit" name="submitBtn" value="Odaberi"/>
        </form>


    </body>
</html>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="_header.jsp" %>




<div class="row">
    <div class="col-lg-6 col-lg-offset-3">
        <h1>Popis država</h1>
        <c:if test="${drzave != null}">
            <table class="table table-bordered table-hover table-striped">
                <thead>
                    <tr>
                        <th>Država</th>
                        <th class='text-center'>Prikaži kupce</th>
                        <th>Obriši državu</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${drzave}" var="d">
                        <tr>
                            <td>${d.naziv}</td>
                            <td class='text-center'>
                                <a href="KupciDrzave?iDDrzava=${d.iDDrzava}">
                                    <i class='glyphicon glyphicon-book'></i>
                                </a>
                            </td>
                            <td class="text-center">
                                <a href="DrzavaDelete?iDDrzava=${d.iDDrzava}" onclick="return confirm('Jeste li sigurni da želite obrisati državu: ${d.naziv}?')">
                                    <i class='glyphicon glyphicon-trash'></i>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
</div>
<div class="row">
    <div class="col-lg-4 col-lg-offset-4">
        <a href="Gradovi" class="btn btn-danger"><i class="glyphicon glyphicon-asterisk"></i>Prikaži sve gradove</a>
    </div>
</div>











<%@include file="_footer.jsp" %>
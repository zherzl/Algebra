<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="_header.jsp" %>


<br/>
<div class='row'>
    <div class="col-lg-8 col-lg-offset-2">
        <a href="Drzave"><< Povratak</a>
    </div>
</div>
<div class="row">
    <div class="col-lg-8 col-lg-offset-2">
        <h1>Kupci za državu: ${kupciZaDrzavu[0].drzava}</h1>
        <c:if test="${kupciZaDrzavu != null}">
            <table class="table table-bordered table-hover table-striped">
                <thead>
                    <tr>
                        <th>Ime</th>
                        <th>Prezime</th>
                        <th>Email</th>
                        <th>Grad</th>
                        <th>Država</th>
                        <th class='text-center'>Uredi</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${kupciZaDrzavu}" var="k">
                        <tr>
                            <td>${k.ime}</td>
                            <td>${k.prezime}</td>
                            <td>${k.email}</td>
                            <td>${k.grad}</td>
                            <td>${k.drzava}</td>
                            <td class='text-center'>
                                <a href="UrediKupca?kupacId=${k.kupacId}&drzavaId=${drzavaId}&ime=${k.ime}&prezime=${k.prezime}&email=${k.email}">
                                    <i class='glyphicon glyphicon-edit'></i>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        <c:if test="${kupciZaDrzavu == null}">
            <h2>Nije odabrana niti jedna država</h2>
        </c:if>
    </div>
</div>











<%@include file="_footer.jsp" %>
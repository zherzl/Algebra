<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="_header.jsp" %>

<div class="row">
    <div class="col-lg-6 col-lg-offset-2">
        <h1>Popis država</h1>

        <form class="form-horizontal" method="POST" action="UrediKupca">
            <fieldset>
                <legend>Uređivanje kupca: ${kupacEdit.getPunoImePrezime()}</legend>
                <input type="hidden" value="${kupacEdit.iDKupac}" name="kupacId" />
                <div class="form-group">
                    <label for="inputIme" class="col-lg-2 control-label">Ime</label>
                    <div class="col-lg-10">
                        <input name="ime" type="text" required="true" class="form-control" id="inputIme" placeholder="Ime" value="${kupacEdit.ime}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPrezime" class="col-lg-2 control-label">Prezime</label>
                    <div class="col-lg-10">
                        <input name="prezime" type="text" required="true" class="form-control" id="inputPrezime" placeholder="Prezime" value="${kupacEdit.prezime}">
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputEmail" class="col-lg-2 control-label">Email</label>
                    <div class="col-lg-10">
                        <input type="text" required="true" class="form-control" name="email" id="inputEmail" placeholder="Email" value="${kupacEdit.email}">
                    </div>
                </div>
                    
                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                        <a href="KupciDrzave?iDDrzava=${iDDrzava}" class="btn btn-default">Povratak</a>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>


            </fieldset>
        </form>

    </div>
</div>





<%@include file="_footer.jsp" %>
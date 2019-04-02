<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="_header.jsp" %>



<div class="row">
    <div class="col-lg-6 col-lg-offset-2">
        <h1>Popis država</h1>

        <form class="form-horizontal" method="POST" action="DodajDrzavu">
            <fieldset>
                <legend>Dodavanje nove države</legend>
                <div class="form-group">
                    <label for="inputNaziv" class="col-lg-2 control-label">Ime</label>
                    <div class="col-lg-10">
                        <input name="naziv" type="text" required="true" class="form-control" id="inputNaziv" placeholder="Naziv države" value="">
                    </div>
                </div>


                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                        <a href="Drzave" class="btn btn-default">Povratak</a>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>


            </fieldset>
        </form>

    </div>
</div>





<%@include file="_footer.jsp" %>
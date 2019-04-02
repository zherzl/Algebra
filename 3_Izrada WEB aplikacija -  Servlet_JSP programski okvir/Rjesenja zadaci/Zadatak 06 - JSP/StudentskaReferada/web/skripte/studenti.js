$(function () {
    // Dohvaćamo studente nakon što se učita DOM 
    dohvatiStudente();
});


function dohvatiStudente() {
//var data = {id_korisnika: 256};
    ajaxPoziv('/StudentskaReferada/IspisStudenata', null, function (res) {
        var tablica = $("#listaStudenata");
        $.each(res, function (i, val) {
            console.log(val.prezime);
            var tr = $("<tr/>").appendTo(tablica);
            $("<td/>").text(val.ime).appendTo(tr);
            $("<td/>").text(val.prezime).appendTo(tr);
            $("<td/>").text(val.godinaStudija).appendTo(tr);
            $("<td/>").text(val.jmbag).appendTo(tr);
        });


    });
}


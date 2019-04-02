function ajaxPoziv(url, data, callback) {

    $.ajax({
        url: url, data: data, dataType: "json", type: "post", contentType: "application/json; charset=utf-8",
        success: function (rezultat) {
            if (rezultat.indexOf("greska") >= 0) {
                alert(rezultat);
            } else {
                callback(rezultat);
            }
        },
        error: function (xhr, ajaxOptions, thrownError) {
            console.log("Greška: " + xhr.responseText + "\n" + thrownError);
        }
    });
//    $.post(url, data, function korisnici(rezultat) {
//        if (rezultat.indexOf("greska") >= 0) {
//            alert(rezultat);
//        } else {
//            callback(rezultat);
//        }
//
//    }, 'json').fail(function (jqXHR, status, thrownError) {
//        console.log("Greška: " + jqXHR.responseText + "\n" + thrownError);
//    });


}
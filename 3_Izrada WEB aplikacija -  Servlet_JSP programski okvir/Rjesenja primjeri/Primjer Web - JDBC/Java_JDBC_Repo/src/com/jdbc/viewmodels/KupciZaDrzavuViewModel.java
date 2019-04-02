package com.jdbc.viewmodels;

public class KupciZaDrzavuViewModel {
    String ime, prezime, email, grad, drzava;
    int kupacId;

    public KupciZaDrzavuViewModel() {}
    public KupciZaDrzavuViewModel(String ime, String prezime, String email, String grad, String drzava, int kupacId) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.grad = grad;
        this.drzava = drzava;
        this.kupacId = kupacId;
    }
    public String getIme() { return ime; }
    public void setIme(String ime) { this.ime = ime; }
    public String getPrezime() { return prezime; }
    public void setPrezime(String prezime) { this.prezime = prezime; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getGrad() { return grad; }
    public void setGrad(String grad) { this.grad = grad; }
    public String getDrzava() { return drzava; }
    public void setDrzava(String drzava) { this.drzava = drzava; }
    public int getKupacId() { return kupacId; }
    public void setKupacId(int kupacId) { this.kupacId = kupacId; }
}


package com.jdbc.repo;

import com.jdbc.models.*;
import com.jdbc.viewmodels.KupciZaDrzavuViewModel;
import java.util.List;


public interface IRepo {
    public List<KupciZaDrzavuViewModel> dohvatiKupceZaDrzavu(int drzavaId);
    public List<Drzava> dohvatiDrzave();
    public List<Grad> dohvatiGradove();
    public List<Kupac> dohvatiKupce();
    
    public int dodajNovuDrzavu(String naziv);
    public void obrisiDrzavu(int id);
    public void updateKupac(Kupac k);
    
    // Helper getteri za provjeru je li sve pri radu OK
    public String getError();
    public boolean isSuccess();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Console;

import DAL.IRepo;
import business.RadSPacijentima;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zlatko
 */
public class Konzola {

    RadSPacijentima radSPac;
    
    public Konzola() {
        ispisiIzbornik();
    }

    private void ispisiIzbornik() {
        
        System.out.println("Ispisujem pacijente");
        
        List<Object> pacijenti = radSPac.dohvatiPacijente();
        for (Object object : pacijenti) {
            System.out.println("...");
        }
    }
    
    private void ispisiProsjekGodina() {
        double  prosjek = radSPac.prosjekGodina();
        System.out.println(prosjek);
    }

    
    
    


}

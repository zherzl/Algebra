
package com.knjige.repo;

import com.knjige.models.Knjiga;
import java.util.ArrayList;
import java.util.List;


public class StaticRepo implements IRepo {

    @Override
    public List<Knjiga> dohvatiSveKnjige() {
        List<Knjiga> knjige = new ArrayList<>();
        
        knjige.add(new Knjiga(1, 1, "Anđeli u mojoj kosi", "Lorna Byrne", 71.10));
        knjige.add(new Knjiga(2, 2, "Žohari", "Jo Nesbo", 71.10));
        knjige.add(new Knjiga(3, 3, "Napiši scenarij", "Jasmina Kallay", 126.0));
        knjige.add(new Knjiga(4, 2, "Svjetionik duše", "Jure Ćurković", 125.10));
        knjige.add(new Knjiga(5, 2, "Zlatarovo zlato", "August Šenoa", 90));
        knjige.add(new Knjiga(6, 1, "Lijek za ljubav", "Leonard Cohen", 179.10));
        
        return knjige;
    }
    
}

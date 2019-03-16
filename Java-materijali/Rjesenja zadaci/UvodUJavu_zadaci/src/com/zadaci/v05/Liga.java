package com.zadaci.v05;

import java.util.*;

class Liga {

    List<Utakmica> utakmice;
    List<Klub> klubovi;

    public List<Utakmica> getUtakmice() {
        return utakmice;
    }

    public void setUtakmice(List<Utakmica> utakmice) {
        this.utakmice = utakmice;
    }

    public List<Klub> getKlubovi() {
        return klubovi;
    }

    public void setKlubovi(List<Klub> klubovi) {
        this.klubovi = klubovi;
    }

    public Liga() {
        this.utakmice = new ArrayList<>();
        this.klubovi = new ArrayList<>();
    }

    public void ispisAktivnihKlubova() {
        for (Klub k : klubovi) {
            System.out.println(k.getNaziv() + " " + k.getGrad());
        }
    }
    
    public void IspisUtakmica() {
        for (Utakmica u : utakmice) {
            System.out.println(u);
            u.ispisStrijelaca();
        }
    }
}

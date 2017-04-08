/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import DAL.IRepo;
import DAL.RepoFactory;
import java.util.List;

/**
 *
 * @author Zlatko
 */
public class RadSPacijentima {
    IRepo repo = RepoFactory.GetRepoInstance(1);

    public List<Object> dohvatiPacijente() {
        return repo.dohvatiPacijente();
    }
    
    public double prosjekGodina() {
        return 0.0;
    }
    
}

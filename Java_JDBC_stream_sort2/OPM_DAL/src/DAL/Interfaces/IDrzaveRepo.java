/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.Interfaces;

import Model.*;
import java.util.*;

/**
 *
 * @author LH
 */
public interface IDrzaveRepo {
    List<Drzava> getDrzave() throws Exception;
    void insertNovaDrzava(String nazivHr) throws Exception;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.Messaging.GET;

import Model.Drzava;
import java.util.*;

/**
 *
 * @author LH
 */
public class GetDrzaveResponse extends ResponseBase {

    public GetDrzaveResponse() {
        //this.drzave = new ArrayList<>();
    }
    
    public List<Drzava> drzave;
}

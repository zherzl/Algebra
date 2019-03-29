/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opm_console;

import BL.Doctors.*;
import BL.Drzave.*;
import BL.Messaging.GET.GetDrzaveRequest;
import BL.Messaging.GET.GetDrzaveResponse;
import BL.Messaging.UPDATE.InsertDrzavaRequest;
import BL.Messaging.UPDATE.InsertDrzavaResponse;
import Model.*;
import java.util.Scanner;

/**
 *
 * @author programer10
 */
public class OPM_Console {

    static DoctorsBL doctorsBL;
    static DrzaveBL drzaveBL;

    public static void main(String[] args) {
        // Prikaži izbornik
        //doctorsBL = new DoctorsBL();
        //ispisiDoktoraPoIdu();
        drzaveBL = new DrzaveBL();

        ubaciNovuDrzavu();

        ispisiDrzave();
    }

    private static void ispisiDoktoraPoIdu() {
//        Doctor d = doctorsBL.getDoctorById();
//        
//        System.out.println(d.getName());
//        System.out.println(d.getLastName());
    }

    private static void ispisiDrzave() {
        GetDrzaveRequest request = new GetDrzaveRequest();
        GetDrzaveResponse response = drzaveBL.GetDrzave(request);

        if (response.getSuccess()) {
            for (Drzava d : response.drzave) {
                System.out.println(d.getNazivHrKratki());
            }
        } else {
            prikaziGresku(response.getMessage());
        }
    }

    private static void prikaziGresku(String message) {
        System.out.println("------------G R E Š K A -------------");
        System.out.println(message);
        System.out.println("-------------------------------------");
    }

    private static void ubaciNovuDrzavu() {
        System.out.println("Upišite državu: (-1 za prekid)");
        Scanner sc = new Scanner(System.in);

        InsertDrzavaRequest request = new InsertDrzavaRequest();
        request.naziv = sc.nextLine();

        if (!request.naziv.equals("-1")) {
            InsertDrzavaResponse response = drzaveBL.insertDrzava(request);
            
            if (!response.getSuccess()) {
                prikaziGresku(response.getMessage());
            }
        }

    }

}

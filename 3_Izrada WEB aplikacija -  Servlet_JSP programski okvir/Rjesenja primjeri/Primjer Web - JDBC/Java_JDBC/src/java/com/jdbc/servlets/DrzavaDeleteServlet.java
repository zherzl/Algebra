
package com.jdbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DrzavaDeleteServlet", urlPatterns = {"/DrzavaDelete"})
public class DrzavaDeleteServlet extends CommonServlet {


    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int drzavaId = Integer.parseInt(request.getParameter("iDDrzava"));
        repo.obrisiDrzavu(drzavaId);
        if (repo.isSuccess() == false) {
            prikaziGresku(repo.getError());
        } else {
            response.sendRedirect("Drzave");
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}

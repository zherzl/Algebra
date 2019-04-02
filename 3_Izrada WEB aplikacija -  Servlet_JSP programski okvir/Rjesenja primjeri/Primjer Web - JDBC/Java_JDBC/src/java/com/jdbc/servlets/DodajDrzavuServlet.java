
package com.jdbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DodajDrzavuServlet", urlPatterns = {"/DodajDrzavu"})
public class DodajDrzavuServlet extends CommonServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.sendRedirect("novaDrzava.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String naziv = request.getParameter("naziv");
        int noviId = repo.dodajNovuDrzavu(naziv);
        
        if (repo.isSuccess() == false) {
            prikaziGresku(repo.getError());
        } else {
            response.sendRedirect("Drzave");
        }
    }

}

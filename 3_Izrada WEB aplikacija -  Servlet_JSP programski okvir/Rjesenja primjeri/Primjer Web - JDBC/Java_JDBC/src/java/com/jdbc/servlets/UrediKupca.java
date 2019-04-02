package com.jdbc.servlets;

import com.jdbc.models.Kupac;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UrediKupcaServlet", urlPatterns = {"/UrediKupca"})
public class UrediKupca extends CommonServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int kupacId = Integer.parseInt(request.getParameter("kupacId"));
        String ime = request.getParameter("ime");
        String prezime = request.getParameter("prezime");
        String email = request.getParameter("email");
        Kupac k = new Kupac(kupacId, ime, prezime, email);
        
        session.setAttribute("iDDrzava", request.getParameter("drzavaId"));
        session.setAttribute("kupacEdit", k);
        response.sendRedirect("urediKupca.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String ime = request.getParameter("ime");
        String prezime = request.getParameter("prezime");
        String email = request.getParameter("email");
        int kupacId = Integer.parseInt(request.getParameter("kupacId"));
        int drzavaId = Integer.parseInt(session.getAttribute("iDDrzava").toString());
        Kupac k = new Kupac(kupacId, ime, prezime, email);
        repo.updateKupac(k);
        
        if (repo.isSuccess() == false) {
            prikaziGresku(repo.getError());
        } else {
            response.sendRedirect("KupciDrzave?iDDrzava=" + drzavaId);
        }
    }
    
}

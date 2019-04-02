package com.jdbc.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jdbc.models.*;
import com.jdbc.viewmodels.*;

@WebServlet(name = "KupciDrzaveServlet", urlPatterns = {"/KupciDrzave"})
public class KupciDrzaveServlet extends CommonServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int drzavaId = Integer.parseInt(request.getParameter("iDDrzava"));
        List<KupciZaDrzavuViewModel> kupci = repo.dohvatiKupceZaDrzavu(drzavaId);
        
        if (repo.isSuccess() == false) {
            prikaziGresku(repo.getError());
        } else {
            session.setAttribute("drzavaId", drzavaId);
            session.setAttribute("kupciZaDrzavu", kupci);
            response.sendRedirect("kupciZaDrzavu.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    }

    
}

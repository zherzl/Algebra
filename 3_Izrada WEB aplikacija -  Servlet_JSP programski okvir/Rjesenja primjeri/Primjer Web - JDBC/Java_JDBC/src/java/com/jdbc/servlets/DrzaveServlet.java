package com.jdbc.servlets;

import com.jdbc.models.Drzava;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DrzaveServlet", urlPatterns = {"/Drzave"})
public class DrzaveServlet extends CommonServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        List<Drzava> drzave = repo.dohvatiDrzave();
        if (repo.isSuccess() == false) {
            prikaziGresku(repo.getError());
        } else {
            session.setAttribute("drzave", drzave);
            response.sendRedirect("popisDrzava.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}

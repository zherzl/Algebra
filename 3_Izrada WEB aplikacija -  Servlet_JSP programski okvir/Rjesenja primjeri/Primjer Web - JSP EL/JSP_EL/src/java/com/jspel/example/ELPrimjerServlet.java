package com.jspel.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ELPrimjerServlet", urlPatterns = {"/ELPrimjer"})
public class ELPrimjerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        //dodajemo atribut u request doseg
        request.setAttribute("ime", "Josip");

        //dodajemo atribut u session doseg
        HttpSession session = request.getSession();
        session.setAttribute("prezime", "Horvat");

        //dodajemo atribut u application doseg
        ServletContext application = getServletContext();
        application.setAttribute("datum", LocalDate.now());

        //dodajemo atribut istog naziva u session, request i application
        session.setAttribute("boja", "<font color='green'>Session - zelena</font>");
        request.setAttribute("boja", "<font color='red'>Request - crvena</font>");
        application.setAttribute("boja", "<font color='yellow'>Application - žuta</font>");

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("ELScopedVariables.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}

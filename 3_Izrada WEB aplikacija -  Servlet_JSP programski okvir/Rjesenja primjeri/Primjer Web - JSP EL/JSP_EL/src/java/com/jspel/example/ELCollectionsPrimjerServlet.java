package com.jspel.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ELCollectionsPrimjerServlet", urlPatterns = {"/ELCollectionsPrimjer"})
public class ELCollectionsPrimjerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String[] gradovi = {"Zagreb", "Split", "Rijeka", "Osijek"};

        ArrayList kvartovi = new ArrayList();
        kvartovi.add("Centar");
        kvartovi.add("Črnomerec");
        kvartovi.add("Maksimir");

        HashMap registracije = new HashMap();
        registracije.put("ZG", "Zagrebačka Županija");
        registracije.put("KR", "Krapinsko Zagorska Županija");
        registracije.put("ST", "Splitsko Dalmatinska Županija");
        registracije.put("RI", "Primorsko Goranska Županija");

        request.setAttribute("gradovi", gradovi);
        request.setAttribute("kvartovi", kvartovi);
        request.setAttribute("rege", registracije);
        RequestDispatcher dispatcher = request
                .getRequestDispatcher("ELCollections.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}

package com.naprednijsp.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SmjerStudijaServlet", urlPatterns = {"/SmjerStudija"})
public class SmjerStudijaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        HttpSession sesija = request.getSession();
        sesija.setAttribute("smjerStudija", "Programerski");
        RequestDispatcher rd = request.getRequestDispatcher("sessionPrimjer.jsp");
        rd.forward(request, response);
    }

}

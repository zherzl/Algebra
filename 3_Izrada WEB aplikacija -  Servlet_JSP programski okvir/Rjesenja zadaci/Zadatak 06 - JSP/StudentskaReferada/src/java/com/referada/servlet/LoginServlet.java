package com.referada.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    HttpSession session;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        session.setAttribute("korisnik", "");
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String usernameConfig = getServletConfig().getInitParameter("username");
        String passwordConfig = getServletConfig().getInitParameter("password");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (username.equalsIgnoreCase(usernameConfig) && password.equals(passwordConfig)) {
            session.setAttribute("korisnik", "Prijavljeni korisnik: " + username);
            response.sendRedirect("Izbornik");
        } else {
            response.sendRedirect("login.jsp");
        }
    }

}

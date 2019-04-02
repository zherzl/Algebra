package com.referada.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


class CommonServlet extends HttpServlet {

    HttpSession session;
    HttpServletResponse response;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        this.response = response;
        this.session = request.getSession();

    }

    public void redirect(String path) {
        if (session.getAttribute("korisnik") == null || session.getAttribute("korisnik") == "") {
            try {
                response.sendRedirect("Login");
            } catch (IOException ex) {
            }

        } else {
            try {
                response.sendRedirect(path);
            } catch (IOException ex) {
            }
        }
    }
}

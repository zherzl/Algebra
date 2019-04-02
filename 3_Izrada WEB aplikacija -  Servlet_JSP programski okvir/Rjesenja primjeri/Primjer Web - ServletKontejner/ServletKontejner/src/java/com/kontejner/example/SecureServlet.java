package com.kontejner.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecureServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        obrada(request, response);
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        obrada(request, response);
    }

    protected void obrada(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // Provjeri da li je korisnik logiran - ako nije, proslijedi ga na
        // login.html.

        // Pročitaj tko je ulogiran iz sesije.
        HttpSession session = request.getSession();

        if (session.getAttribute("uid") != null) {

            String user = session.getAttribute("uid").toString();

            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Pozdrav " + user);
            out.println("!</h1>");
            out.println("</body>");
            out.println("</html>");
        } else {
            response.sendRedirect("login.html");
        }
    }
}

package com.sesija.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        // Postavljamo atribut u sesiju kako bismo ga procitali u servletima
        // na koje pokazuju poveznice "Prijepis ocjena" i "Popis rokova".
        // Za potrebe ovog primjera, u sesiju stavljamo ime "Pero Perić".
        session.setAttribute("ime", "Pero Perić");

        // Enkodiranje stranice postavljamo na UTF-8 što nam osigurava 
        // ispravno prikazivanje hrvatskih znakova.
        String contentType = "text/html;charset=UTF-8";
        response.setContentType(contentType);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Studomat");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Odaberite željenu radnju: </h1>");
        String encodedUrl = response.encodeURL("/HTTPSession/PrijepisOcjena");
        out.println(" <a href=\"" + encodedUrl + "\">Prijepis ocjena</a><br>");
        encodedUrl = response.encodeURL("/HTTPSession/PopisRokova");
        out.println(" <a href=\"" + encodedUrl + "\">Popis rokova</a><br>");

        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}

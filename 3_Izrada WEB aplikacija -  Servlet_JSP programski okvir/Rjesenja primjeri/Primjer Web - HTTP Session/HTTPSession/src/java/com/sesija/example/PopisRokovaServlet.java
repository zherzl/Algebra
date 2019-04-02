package com.sesija.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PopisRokovaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        HttpSession session = request.getSession(true);
        String ime = session.getAttribute("ime").toString();
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Popis rokova");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        // Podatak pročitan iz sesije koristimo u HTML prikazu.
        out.println("<h1> Popis rokova za " + ime + " </h1>");

        out.println("<table border='1'>");

        out.println("<tr>");
        out.println("<th> Kolegij </th>");
        out.println("<th> Datum </th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Matematika I </td>");
        out.println("<td> 09.02 2010 09:00 </td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Uvod u programiranje </td>");
        out.println("<td> 19.02 2010 12:00 </td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}

package com.sesija.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PrijepisOcjenaServlet extends HttpServlet {

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
        out.println("Prijepis ocjena");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");

        // Podatak pročitan iz sesije koristimo u HTML prikazu.
        out.println("<h1> Prijepis ocjena za " + ime + " </h1>");

        out.println("<table border='1'>");

        out.println("<tr>");
        out.println("<th> Kolegij </th>");
        out.println("<th> Ocjena </th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Matematika I </td>");
        out.println("<td> 5 </td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Uvod u programiranje </td>");
        out.println("<td> 4 </td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Engleski jezik </td>");
        out.println("<td> 3 </td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Programiranje u Javi I </td>");
        out.println("<td> 4 </td>");
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

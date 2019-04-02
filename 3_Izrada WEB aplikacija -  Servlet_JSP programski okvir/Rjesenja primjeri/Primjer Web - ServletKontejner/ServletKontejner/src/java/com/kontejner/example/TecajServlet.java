package com.kontejner.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TecajServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Tečaj");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<td>");
        out.println("KN");
        out.println("</td>");
        out.println("<td>");
        out.println("EUR");
        out.println("</td>");
        out.println("</tr>");
        for (int i = 100; i <= 1000; i += 100) {
            out.println("<tr>");
            out.println("<td>");
            out.println(i);
            out.println("</td>");
            out.println("<td>");
            out.println(i / Double.parseDouble(getServletConfig().getInitParameter("tecajEUR")));
            out.println("</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

}

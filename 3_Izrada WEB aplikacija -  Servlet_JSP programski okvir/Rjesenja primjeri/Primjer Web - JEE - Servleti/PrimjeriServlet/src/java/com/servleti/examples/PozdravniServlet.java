package com.servleti.examples;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PozdravniServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        // Dohvacanje vrijednosti parametra 'ime'.
        String ime = request.getParameter("ime");
        // Dohvaćanje svih vrijednosti odbaranih u listi 'jezik'.
        String[] jeziciID = request.getParameterValues("jezik");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        try {
            for (String jezik : jeziciID) {
                int idJezika = Integer.parseInt(jezik);
                switch (idJezika) {
                    case 1:
                        out.println("Pozdrav " + ime + "!<br />");
                        break;
                    case 2:
                        out.println("Hello " + ime + "!<br />");
                        break;
                    case 3:
                        out.println("Hallo " + ime + "!<br />");
                        break;
                    case 4:
                        out.println("Ciao " + ime + "!<br />");
                        break;
                    case 5:
                        out.println("Hola " + ime + "!<br />");
                        break;
                }
            }
        } catch (NumberFormatException e) {
            out.println("Dogodila se pogreška na stranici!");
        }
        out.println("</body>");
        out.println("</html>");

    }

}

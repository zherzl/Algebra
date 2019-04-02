package com.servleti.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IspisZaglavljaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ZaglavljeServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ZaglavljeServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
    }

    public void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        // Dohvaćanje imena svih zaglavlja iz HTTP zahtjeva.
        Enumeration<String> zaglavlja = req.getHeaderNames();
        while (zaglavlja.hasMoreElements()) {
            String zaglavlje = zaglavlja.nextElement();
            // Dohvacanje vrijednosti zaglavlja.
            String value = req.getHeader(zaglavlje);
            out.println("Naziv zaglavlja: " + zaglavlje + " , vrijednost = " + value + "<br/>");
        }
        out.println("</body>");
        out.println("</html>");
    }

}

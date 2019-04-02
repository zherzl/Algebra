package com.sjednica.rjesenje;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PrikaziGradoveServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        HttpSession session = request.getSession();
        List<String> gradovi = (ArrayList<String>) session.getAttribute("gradovi");
        
        if (gradovi != null) {
            PrintWriter out = response.getWriter();
            
            for (String g : gradovi) {
                out.write("<div>" + g + "</div>");
            }
            
            out.write("<br/>");
            out.write("<a href='pocetna.html'>Povratak</a>");
        } else {
            response.sendRedirect("pocetna.html");
        }
    }
    
}

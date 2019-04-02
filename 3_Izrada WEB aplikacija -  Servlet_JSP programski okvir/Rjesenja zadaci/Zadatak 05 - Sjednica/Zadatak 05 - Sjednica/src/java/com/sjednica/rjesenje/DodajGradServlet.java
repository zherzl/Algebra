package com.sjednica.rjesenje;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DodajGradServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        HttpSession session = request.getSession(true);
        List<String> gradovi = (ArrayList<String>)session.getAttribute("gradovi");
        String noviGrad = request.getParameter("grad");
        
        if (gradovi == null) {
            gradovi = new ArrayList<>();
        }
        
        if (gradovi.contains(noviGrad) == false && noviGrad.length() > 0) {
            gradovi.add(noviGrad);
            session.setAttribute("gradovi", gradovi);
        }
        
        response.sendRedirect("pocetna.html");
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zadatak0304.rjesenje;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author office
 */
public class TableGeneratorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

//             Broj redaka
//             Broj kolona
//             Boja pozadine tablice
//             Debljina okvira
//             Razmak između ćelija
            int brRedaka = Integer.parseInt(request.getParameter("brojRedaka"));
            int brKolona = Integer.parseInt(request.getParameter("brojKolona"));
            String boja = request.getParameter("boja");
            int debljina = Integer.parseInt(request.getParameter("debljina"));
            int razmak = Integer.parseInt(request.getParameter("razmak"));

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TableGeneratorServlet</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<table border='" + debljina + "' cellspacing='" + razmak + "'>");
            for (int i = 0; i < brRedaka; i++) {
                out.println("<tr id='" + i + "' onclick='btnClick(" + i + ")'>");
                for (int j = 0; j < brKolona; j++) {
                    out.println("<td >");
                    out.println(" " + (i + j));
                    out.println("</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");

            out.println("<h1>Servlet TableGeneratorServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("<script> function btnClick(id) {\n"
                    + "    var x = document.getElementById(id);\n"
                    + "    x.style.backgroundColor = \"red\";            \n"
                    + "} </script>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

package com.dinamickisadrzaj.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ZbrojServlet", urlPatterns = {"/ZbrojServlet"})
public class ZbrojServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        PrintWriter out = response.getWriter();

        try {
            int prvi = Integer.parseInt(request.getParameter("prvi"));
            int drugi = Integer.parseInt(request.getParameter("drugi"));
            int zbroj = prvi + drugi;
            out.println("Rezultat zbrajanja brojeva " + prvi + " i " + drugi + " je " + zbroj);
        } catch (Exception e) {
            out.print("Dogodila se greška na stranici.");
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

}

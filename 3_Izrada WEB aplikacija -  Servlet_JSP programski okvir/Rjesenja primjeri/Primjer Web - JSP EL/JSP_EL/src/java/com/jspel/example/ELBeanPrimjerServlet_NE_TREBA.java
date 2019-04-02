package com.jspel.example;

import com.jspel.models.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ELBeanPrimjerServlet", urlPatterns = {"/ELBeanPrimjer"})
public class ELBeanPrimjerServlet_NE_TREBA extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
//        Beanovi se ne koriste
//        Instruktor instruktor = new Instruktor("Stjepan", "Cvek", "1234567890000");
//
//        Student student = new Student("Josip", "Horvat", instruktor);
//
//        request.setAttribute("stud", student);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("BeanPrimjer.jsp");
//        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}

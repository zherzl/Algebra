package com.referada.servlet;

import com.referada.model.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "NoviStudentServlet", urlPatterns = {"/NoviStudent"})
public class NoviStudent extends CommonServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        super.processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        redirect("noviStudent.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        try {
            List<Student> studenti = (ArrayList<Student>) session.getAttribute("studenti");
            // Ako u sessionu nema ništa
            if (studenti == null) {
                studenti = new ArrayList<>();
            }

            Student s = new Student();
            s.setIme(request.getParameter("ime"));
            s.setPrezime(request.getParameter("prezime"));
            s.setGodinaStudija(Integer.parseInt(request.getParameter("godina")));
            s.setJmbag(request.getParameter("jmbag"));
            studenti.add(s);

            session.setAttribute("studenti", studenti);
        } catch (Exception e) {
        }

        redirect("Izbornik");

    }

}

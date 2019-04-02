package com.referada.servlet;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import com.referada.model.Student;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "IspisStudenataServlet", urlPatterns = {"/IspisStudenata"})
public class IspisStudenata extends CommonServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        super.processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        redirect("studenti.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
        this.session = request.getSession();
        PrintWriter out = response.getWriter();
        List<Student> studenti = (ArrayList<Student>) session.getAttribute("studenti");
        try {
            String podaci = new Gson().toJson(studenti);
            out.write(podaci);
        } catch (Exception ex) {
            Gson json = new Gson();
            String greska = json.toJson("greska:" + ex.getMessage());
            out.write(greska);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

}

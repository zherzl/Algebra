package com.knjige.servlets;

import com.knjige.factory.RepoFactory;
import com.knjige.factory.RepoType;
import com.knjige.models.Knjiga;
import com.knjige.repo.IRepo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "HomeServlet", urlPatterns = {"/Home"})
public class HomeServlet extends HttpServlet {

    HttpSession session;
    IRepo repo;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        this.session = request.getSession();
        this.repo = RepoFactory.getRepo(RepoType.StaticRepo);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        if (session.getAttribute("knjige") == null) {
            List<Knjiga> knjige = repo.dohvatiSveKnjige();
            session.setAttribute("knjige", knjige);
        }
        response.sendRedirect("home.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}

package com.jdbc.servlets;

import com.jdbc.factory.RepoFactory;
import com.jdbc.factory.RepoType;
import com.jdbc.repo.IRepo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class CommonServlet extends HttpServlet {

    // Sad svi servleti koji nasljeđuju ovaj mogu bez brige pristupati
    public IRepo repo;
    HttpServletRequest request; 
    HttpServletResponse response;
    HttpSession session;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        this.repo = RepoFactory.getRepository(RepoType.SqlRepo);
        this.request = request;
        this.response = response;
        this.session = request.getSession();
    }
    
    public void prikaziGresku(String greska) 
    {
        try {
            request.setAttribute("greska", greska);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Greska.jsp");
            dispatcher.forward(request, response);
            
        } catch (ServletException ex) {
        } catch (IOException ex) {
        }
    }
    
}

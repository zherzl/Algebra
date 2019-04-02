package com.servleti.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ZaglavljaOdgovoraServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Dodaj zaglavlje "refresh"–automatsko osvježavanje stranice svakih 5 sekundi.
		response.setHeader("refresh", "5");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Trenutno vrijeme");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(LocalDateTime.now());
		out.println("</body>");
		out.println("</html>");
	}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }



}

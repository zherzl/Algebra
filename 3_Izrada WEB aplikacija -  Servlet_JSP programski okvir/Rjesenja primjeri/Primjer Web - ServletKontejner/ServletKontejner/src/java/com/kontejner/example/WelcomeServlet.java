package com.kontejner.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeServlet extends HttpServlet {


	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Pročitaj parametre iz zahtjeva.
		String korisnik = request.getParameter("userid");
		String lozinka = request.getParameter("passwd");
		// Radi jednostavnosti pretpostavka je da je jedini valjani user "pero".
		if (korisnik.equalsIgnoreCase("pero") && lozinka.equals("pero")) {
			// U HTTP sesiju pohranjuje atribut pod imenom 'uid'.
			// Tu informaciju ćemo koristiti za provjeru da li je korisnik
			// ulogiran pri ulasku na SecureServlet.
			// Dohvati sesiju
			HttpSession session = request.getSession();
			session.setAttribute("uid", korisnik);
			ServletContext context = getServletContext();
			// Prosljedjivanje zahtjeva prema servletu SecureServlet.
			RequestDispatcher rd = context.getRequestDispatcher("/Secure");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.html");
		}
	}
}

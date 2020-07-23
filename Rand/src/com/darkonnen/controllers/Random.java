package com.darkonnen.controllers;

import java.io.IOException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Random
 */
@WebServlet("/Random")
public class Random extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Random() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String count = (String) session.getAttribute("count");
		Integer current_counter;	

		if (count == null) {
			session.setAttribute("count", "0");

		} else {
			current_counter = Integer.parseInt(count);
			current_counter += 1;
			count = current_counter.toString();
			session.setAttribute("count", count);
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/random.jsp");
		view.forward(request, response);
		
		
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		String contrasena;
		
		
		for (int i = 0; i < 10; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		contrasena = sb.toString();
		SimpleDateFormat date = new SimpleDateFormat("dd MMMM yyyy HH:mm a");
		session.setAttribute("password", contrasena);
		session.setAttribute("date", date.format(new Date()));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

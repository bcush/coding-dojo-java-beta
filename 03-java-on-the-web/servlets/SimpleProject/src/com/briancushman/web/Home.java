package com.briancushman.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
//@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the value for the query parameter
		String firstName, lastName, favoriteLanguage, homeTown;
		
		if (request.getParameter("firstName") == null) {
			firstName = "Unknown";
		} else {
			firstName = request.getParameter("firstName");
		}
		
		if (request.getParameter("lastName") == null) {
			lastName = "Unknown";
		} else {
			lastName = request.getParameter("lastName");
		}
		
		if (request.getParameter("favoriteLanguage") == null) {
			favoriteLanguage = "Unknown";
		} else {
			favoriteLanguage = request.getParameter("favoriteLanguage");
		}
		
		if (request.getParameter("homeTown") == null) {
			homeTown = "Unknown";
		} else {
			homeTown = request.getParameter("homeTown");
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, " + firstName + " " + lastName + "</h1>");
		out.write("<h2>Your favorite language is: " + favoriteLanguage + "</h2>");
		out.write("<h2>Your hometown is: " + homeTown + "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

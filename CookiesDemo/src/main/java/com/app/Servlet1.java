package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/serv1"})
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//read the firstName from request object
		String fname = request.getParameter("txtFirstname");
		//create the cookie
		Cookie c = new Cookie("fnm", fname);
		//set max age for cookie
		c.setMaxAge(30);
		//add cookie to response
		response.addCookie(c);
		
		pw.write("<html><body><center>");
		pw.write("<form action='serv2' method='post'>");
		pw.write("Enter LastName: <input type='text' name='txtLastname'>");
		pw.write("<br><br><input type='submit' value='Go'>");
		pw.write("</form></center></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

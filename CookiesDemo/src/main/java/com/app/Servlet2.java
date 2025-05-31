package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/serv2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet2() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		Cookie[] ck = request.getCookies();
		if(ck!=null)
		{
			String str = ck[0].getValue();
			pw.write("<h1><center>");
			pw.write("FirstName = "+str);
			pw.write("<br>LastName "+request.getParameter("txtLastname"));
			pw.write("</center></h1>");
		}
		else
		{
			pw.write("<h1><center>");
			pw.write("Session Expired!!");
			pw.write("</center></h1>");
		}
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

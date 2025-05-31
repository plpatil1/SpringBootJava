package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/servlet1")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServlet() {
        super();
       System.out.println("Servlet Constructor");
    }
    
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		 System.out.println("Servlet Init");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 System.out.println("In doGet()");
		 response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();
		 
		 String username = request.getParameter("txtUsername");
		 String password =(String) request.getAttribute("password");
		 
		 if(password.equalsIgnoreCase("admin123"))
		 {
			 pw.write("Valid!! "+username);
		 }
		 else
		 {
			 pw.write("Invalid!!");
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

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg1.setContentType("text/html");
		Date d= new Date();
		PrintWriter pw = arg1.getWriter();
		pw.print("<html>");
		pw.print("<head><title>GenericServletDemo</title></head>" );
		pw.print("<body>");
		pw.print("<H2> Servlet created using GenericServlet class @ " + d.toString() + "</H2>");
        pw.print("</BODY>");
        pw.print("</HTML>");
	}
	

}

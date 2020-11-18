package servlet_basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		int n3 = n1 + n2;
	    PrintWriter pw = response.getWriter();
	    pw.println(n3);
		System.out.println(n3);
	}
}

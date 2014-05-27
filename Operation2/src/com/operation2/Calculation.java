package com.operation2;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculation extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("hello");
		
		 response.setContentType("text/html");  
			int name1=Integer.parseInt( request.getParameter("number1"));
			int  name2=Integer.parseInt( request.getParameter("number2"));
			String select=(String) request.getParameter("drop");
			
		//	out.println("Hi "+name1 +"" +name2 +" " +select);
			// request.setAttribute("name1",name1);
			// req.getRequestDispatcher("Operation.html").include(req, resp);  
			
			if(select.equals("Addition")){
				int result=name1+name2;
				 request.setAttribute("name1",name1);
				 request.setAttribute("name2",name2);
				 request.setAttribute("result",result);
				 request.setAttribute("select",select);
				request.getRequestDispatcher("Operation.jsp").forward(request, response);  
			}

			else if(select.equals("Subtraction")){
				int result=name1-name2;
				 request.setAttribute("name1",name1);
				 request.setAttribute("name2",name2);
				 request.setAttribute("result",result);
				 request.setAttribute("select",select);
				request.getRequestDispatcher("Operation.jsp").forward(request, response);  
			}

			else if(select.equals("Multiplication")){
				int result=name1*name2;
				 request.setAttribute("name1",name1);
				 request.setAttribute("name2",name2);
				 request.setAttribute("result",result);
				 request.setAttribute("select",select);
				request.getRequestDispatcher("Operation.jsp").forward(request, response);  
			}

			else if(select.equals("Division")){
				int result=name1/name2;
				 request.setAttribute("name1",name1);
				 request.setAttribute("name2",name2);
				 request.setAttribute("result",result);
				 request.setAttribute("select",select);
				request.getRequestDispatcher("Operation.jsp").forward(request, response);  
			}
			
			
	}

}


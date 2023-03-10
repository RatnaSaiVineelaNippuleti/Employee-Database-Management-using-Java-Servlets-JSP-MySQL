package com.employee.empServlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

import com.employee.emp.Employee;
import com.employee.factory.FactoryService;
import com.employee.service.Service;

public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*int id=Integer.parseInt(request.getParameter("id"));
		Service service=FactoryService.getEmpService();
		Employee emp=service.searchEmployee(id);*/
		try {
		if(request.getParameter("search")!=null)
		{   int id=Integer.parseInt(request.getParameter("search"));
		   Service service=FactoryService.getEmpService();
		   Employee emp=service.searchEmployee(id);
			if(emp==null)
			{
				request.setAttribute("mes","Employee not existed in the database");
				RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
				dispatcher.forward(request, response);
				
			}
			else
			{   
				request.setAttribute("emp", emp);
				request.setAttribute("mes","Employee Existed with given employee id");
				RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
				dispatcher.forward(request, response);
			}
		}
		else
		{
			int id=Integer.parseInt(request.getParameter("id"));
		     Service service=FactoryService.getEmpService();
			 Employee emp=service.searchEmployee(id);
		request.setAttribute("emp", emp);
		RequestDispatcher dispatcher=request.getRequestDispatcher("update.jsp");
		dispatcher.forward(request, response);
		
		}
		
	}
		catch(Exception e){
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			out.println("<h1 style='text-align:center'>error</h1>");
			out.println("</body></html>");
			
		}
	}


}

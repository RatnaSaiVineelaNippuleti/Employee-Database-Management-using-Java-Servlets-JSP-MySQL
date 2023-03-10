package com.employee.empServlets;
import com.employee.emp.Employee;
import com.employee.factory.*;
import com.employee.service.*;
//import com.employee.empDao.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
//import java.sql.*;

public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		int id=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("empname");
		String doj=request.getParameter("doj");
		String designation=request.getParameter("designation");
		//Connection con=FactoryConnection.getFactoryConnection();
		Service service=FactoryService.getEmpService();
		Employee emp=new Employee();
		emp.setEid(id);
		emp.setName(name);
		emp.setDOJ(doj);
		emp.setDesignation(designation);
		int status=service.addEmployee(emp);
		if(status==0)
		{   
			request.setAttribute("message","Employee successfully registered");
			
			
		}
		else if(status==1)
		{
			request.setAttribute("message","Employee enrollment failed");
		}
		else
		{
			request.setAttribute("message","Employee already enrolled with the given employee id");
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
		
		}
		catch(Exception e)
		{
				PrintWriter out=response.getWriter();
				out.println("<html><body style='font color:red'>");
				out.println("<h1 style='text-align:center'>error</h1>");
				out.println("</body></html>");
				
			}
		}
		
	}


<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="com.employee.emp.*" import="com.employee.factory.*"
    import="java.sql.*" import="com.employee.service.*" import="com.employee.empDao.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/first.css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="c">
<% 
    System.out.println(session.getAttribute("mess"));

if(request.getAttribute("mes")==null&&request.getAttribute("message")==null&&session.getAttribute("mess")==null)
{
  if(session.getAttribute("emp")!=null)
  {
  int id=Integer.parseInt(request.getParameter("idd"));
  String name=request.getParameter("name");
  String doj=request.getParameter("doj");
  String designation=request.getParameter("designation");
  Employee emp=new Employee();
  emp.setEid(id);
  emp.setName(name);emp.setDOJ(doj);emp.setDesignation(designation);
  Service service=FactoryService.getEmpService();
  String state =service.updateEmployee(emp);
  session.setAttribute("m",state);
  String a=(String)session.getAttribute("m");
    out.println(a);
    }
  else
  {
	  String a=(String)session.getAttribute("m");
	    out.println(a);
  }
  %>
    <br><br><a href="welcome.jsp">Return to home</a>
<% }
else if(request.getAttribute("message")!=null)
{
	String a=(String)request.getAttribute("message");
    out.println(a);%>
    <br><br><a href="welcome.jsp">Return to home</a>
    <%
}
else if((request.getAttribute("mes")!=null))
{
	String a=(String)request.getAttribute("mes");
    out.println(a);
    Employee emp=(Employee)request.getAttribute("emp");%>
   <%
    if(emp!=null){%>
    <br><br>Employee id <input type="text" name="sid" value="<%out.println(emp.getEid());%>" readonly/><br><br>
    Employee name<input type="text" name="sid" value="<%out.println(emp.getName());%>" readonly/><br><br>
    Employee DOJ<input type="text" name="sid" value="<%out.println(emp.getDOJ());%>" readonly/><br><br>
    Employee designation<input type="text" name="sid" value="<%out.println(emp.getDesignation());%>" readonly/><br><br>
    <br><br> <a href="welcome.jsp">Return to home</a>
     <%} 
  }else
	 {
	 String a=(String)session.getAttribute("mess");
	 out.println(a);
	 }
	 %>
    </body>
</html>
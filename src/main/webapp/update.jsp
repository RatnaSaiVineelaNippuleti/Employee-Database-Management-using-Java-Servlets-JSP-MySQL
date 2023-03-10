<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.employee.emp.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:#00ffff">
<form action="success.jsp" method="post">
<%!Employee statue=null;
int id;
%>
 <% statue=(Employee)request.getAttribute("emp");
     if(statue==null)
     {
    	session.setAttribute("m","employee not existed");
    	%>
    	<a href="welcome.jsp">exit</a>
    <%  }
     else
    {
     %><h2>update the details</h2>
    <br><br> Employee id<input type="text" name="idd" value="<%out.println(statue.getEid());%>" /><br><br>
      Employee name<input type="text" name="name" value="<%out.println(statue.getName());%>"/><br><br>
      Employee DOJ <input type="text" name="doj" value="<%out.println(statue.getDOJ());%>"/><br><br>
      Employee Designation  <input type="text" name="designation" value="<% out.println(statue.getDesignation());%>"/><br><br>
    <%} session.setAttribute("emp",statue);%>  <input type="submit" value="save">
 </form>
</body>
</html>
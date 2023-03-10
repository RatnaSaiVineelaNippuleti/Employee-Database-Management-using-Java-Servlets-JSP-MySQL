<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.employee.service.*" import="com.employee.factory.*"
    import="com.employee.empDao.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:yellow"> 
<form action="welcome.jsp" method="post">
<div style="text-align:center" >
<%      int id=Integer.parseInt(request.getParameter("eidd"));
     Service service=FactoryService.getEmpService();
     String statuss=service.deleteEmployee(id);
    session.setAttribute("mess",statuss);%>
 <h2 style="text-align:center"><%out.println(session.getAttribute("mess"));%></h2>
<input type="submit" value="go to home"/>
</div>
</form>
</body>
</html>
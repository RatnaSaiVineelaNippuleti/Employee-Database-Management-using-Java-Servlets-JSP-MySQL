<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.employee.service.*" import="com.employee.factory.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:skyblue">
<%if(request.getParameter("link").equals("a"))
{ %>
<form action="./edit" method="post">
enter employee id<input type="text" name="id"/>
<input type="submit" value="search"/>
</form>
<%} else{%>
<form action="delete.jsp" method="post">
enter employee id<input type="text" name="eidd"/>
<input type="submit" value="delete"/>
</form>
<%} %>
</body>
</html>
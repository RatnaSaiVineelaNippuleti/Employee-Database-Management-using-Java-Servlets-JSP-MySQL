<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/first.css" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
</head>
 <body style="background-color:skyblue"> 
<div style="text-align:center" >
<h1>Employee Management</h1>
</div>
<form method="post" action="./edit">
<div style="float:right">
SEARCH BY ID<input type="text" name="search"/>
<input type="submit" value="search"/><a href=""><jsp:include page="head.jsp"/></a>
</div>
</form>7
<form method="post" action="./sign">
<div class="contain" >
<div class="child1">
<h2 >Register</h2>
Employee id <input type="text" name="eid"/><br><br>
Employee name <input type="text" name="empname"/><br><br>
DOJ <input type="text" name="doj"/><br><br>
Designation<input type="text" name="designation"/><br><br>
<input type="submit" value="add"/>
<div style="text-align:center">
</div>
</div>
</div>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table{
	border-collapse: collapse;
	}
</style>
</head>
<body>
<h1>All EMPLOYEE DETAILS : </h1>
	<table border="2" cellPadding="5">
	<tr>
	<th>ID</th>
	<th>NAME</th>
	<th>DESIGNATION</th>
	<th>SALARY</th>
	</tr>
<c:forEach items="${employeelist}" var="employee">
	<tr>
	<td>${employee.id}</td>
	<td>${employee.name}</td>
	<td>${employee.designation}</td>
	<td>${employee.salary}</td>
	</tr>
</c:forEach>
	</table>
	<br>
	<a href="index.jsp">Back to Home</a>
</body>
</html>
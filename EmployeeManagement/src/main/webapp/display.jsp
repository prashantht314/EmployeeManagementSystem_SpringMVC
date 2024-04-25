<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<h1>Details of the Employee : ${employee.name}</h1>
	<table border="2" cellPadding="5">
	<tr>
	<th>ID</th>
	<th>NAME</th>
	<th>DESIGNATION</th>
	<th>SALARY</th>
	</tr>
	<tr>
	<td>${employee.id}</td>
	<td>${employee.name}</td>
	<td>${employee.designation}</td>
	<td>${employee.salary}</td>
	</tr>
	</table>
	<br>
	
	<a href="index.jsp">Back to Home</a>
</body>
</html>
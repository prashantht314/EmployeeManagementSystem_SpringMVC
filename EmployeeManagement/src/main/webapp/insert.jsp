<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter the employee details : </h1>
	<form:form action="insertEmployee" modelAttribute="employee">
	<form:label path="name">ENTER NAME : </form:label>
	<form:input path="name"/><br><br>
	<form:label path="designation">ENTER DESIGNATION : </form:label>
	<form:input path="designation"/><br><br>
	<form:label path="salary">ENTER SALARY : </form:label>
	<form:input path="salary"/><br><br>
	
	<input type="submit" value="INSERT">
	
	</form:form>
</body>
</html>
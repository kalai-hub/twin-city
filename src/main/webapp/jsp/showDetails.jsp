<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
	<link href="/css/style.css" rel="stylesheet"></link>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Show Details</title>
	</head>
	
	<body id="b102">
	
	<h1 id="h101">Patient Details</h1>
		<table id="t102">
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Gender</th>
				<th>Weight in kg</th>
			</tr>
			
			<c:forEach items="${details}" var="details">
				<tr> 
				    	<td>${details.treatments.name}</td>
				    	<td align="center">${details.age}</td>
				    	<td align="center">${details.name}</td>
				    	<td align="center">${details.weight}</td>
				    	<td><a href="/showAilments">ailments</a>	
		   		</tr>
			</c:forEach>
		</table>
		<a href="/" id="a102">Home</a>
	</body>

</html> 
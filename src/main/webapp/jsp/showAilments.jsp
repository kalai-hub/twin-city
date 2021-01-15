<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/css/style.css" rel="stylesheet"></link>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Ailments</title>
</head>
<body id="b103">
	<h1 id="h101">Ailments and Consultation</h1>
	<table id="t103">
		<tr>
			<th>Name</th>
			<th>Ailments</th>
			<th>Consultation</th>
		</tr>
		<c:forEach items="${ailments}" var="ailments">
			<tr> 
				<td>${ailments.treatments.name}</td>
		    	<td align="center">${ailments.details.problems}</td>
		    	<td align="center">${ailments.consultation}</td>
		    	<td><a href="/showTreatments">Treatments</a>
	   		</tr>
		</c:forEach>
	</table>
	<a href="/" id="a102">Home</a>
</body>
</html>
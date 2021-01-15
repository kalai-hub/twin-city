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
<title>Show Treatments</title>
</head>
<body id="b104">
	<h1 id="h101">Treatment</h1>
	
	<table id="t104">
		<tr>
			<th>Name</th>
			<th>Treatment</th>
		</tr>
		
		<c:forEach  items="${treatments}" var="treatments">
			<tr> 
		    	<td>${treatments.name}</td>
		    	<td align="center">${treatments.treatmentType}</td>
	   		</tr>
		</c:forEach>
	</table>
	<a href="/" id="a102">Home</a>
</body>
</html>
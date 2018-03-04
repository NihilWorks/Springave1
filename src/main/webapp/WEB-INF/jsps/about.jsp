<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- SO I CAN USE JSTL -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About</title>
</head>
<body>

	Request using EL: ${bestWay}
	<p />
	This is also the most elegant way to pass value to jsp<p />
	
	JSTL:
	<c:out value="${bestWay}"></c:out><p />
	<c:out value="${secondAttr}"></c:out><p />
</body>
</html>
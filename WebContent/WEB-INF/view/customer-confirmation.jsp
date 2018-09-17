<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
The customer is confirmation: ${customer.firstName} ${customer.lastName}
<br><br>
Free Passes: ${customer.freePasses}
<br><br>
PostalCode: ${customer.postalCode}
<br><br>
CourseCode: ${customer.courseCode}
</body>
</html>
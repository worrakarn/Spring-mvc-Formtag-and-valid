<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processform" modelAttribute="student">
	
		First name: <form:input path="firstName"/><br><br>
		Last name: <form:input path="lastName"/>
		<br><br>
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br><br>
		Favorite Language:
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
		<br><br>
		<form:checkboxes items="${student.operatingSystemOptions}" path="operatingSystem"/>
		<br><br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>
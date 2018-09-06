<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName"></form:input>
<br><br>
Last Name: <form:input path="lastName"></form:input>
<br><br>
Country: <form:select path="country">
<form:options items = "${student.countryOptions}" />
</form:select><br><br>
Favorite Language:
Java <form:radiobutton path="favoriteLanguage" value="Java"/>
PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
C#<form:radiobutton path="favoriteLanguage" value="C#"/>
Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
<br><br>
Operating systems: 
 MAC<form:checkbox path="operatingSystems" value="MAC"/>
Windows<form:checkbox path="operatingSystems" value="Windows"/>
Linux<form:checkbox path="operatingSystems" value="Linux"/>
<br><br>
<input type="Submit" value="Submit">
<br><br>
<br><br>
<br><br>
</form:form>
</body>
</html>
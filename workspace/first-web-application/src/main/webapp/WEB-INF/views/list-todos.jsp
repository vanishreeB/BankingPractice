<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.7-1/css/bootstarp.min.css" rel="stylesheet">
</head>
<body>
<table>
<caption> Your todos are </caption>
<thead>
<tr>
<th>Description</th>
<th>Target Date</th>
<th>Is Completed</th>
</tr>
</thead>
<tbody>
<c:forEach items="${todos}" var="todo">  
<tr>
<td>${todo.desc}</td>
<td>${todo.targetDate} </td>
<td>${todo.done}</td>
</tr>
</c:forEach>
</tbody>
</table>

<a class="button" href="/add-todo"> Add </a>
<script src="webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="bootstrap/3.3.7-1/js/bootstarp.min.js"></script>

</body>
</html>
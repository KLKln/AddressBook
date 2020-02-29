<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "editPersonServlet" method="post">
First Name: <input type = "text" name = "firstName" value="${personToEdit.firstName }">
Last Name: <input type = "text" name = "lastName" value="${personToEdit.lastName }">
Date of Birth: <input type = "date" name = "birthDate" value="${personToEdit.birthDate }">
</form>
</body>
</html>
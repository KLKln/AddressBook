<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Entry</title>
</head>
<body>
	<form action="editPersonServlet" method="post">
		First Name: <input type="text" name="firstName"	value="${personToEdit.firstName }"> 
		Last Name: <input type="text" name="lastName" value="${personToEdit.lastName }">
		Date of Birth: <input type="date" name="birthDate" placeholder = "MM/dd/yyyy" value="${personToEdit.birthDate }">
		<input type = "hidden" name = "id" value="${personToEdit.personId}">
		<input type = "submit" value="save updated person details">
	</form>
</body>
</html>
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
		Last Name: <input type="text" name="lastName" value="${personToEdit.lastName }">  </br></br>
		Date of Birth: <input type="date" name="birthDate" placeholder = "MM/dd/yyyy" value="${personToEdit.birthDate }"> </br></br>
		Phone Number: <input type="text" name="phoneNumber" placeholder = "123-456-7890" value="${ciToEdit.phone}"> </br></br>
		Phone Type: <input type="text" name="phoneType" placeholder = "home/mobile/work" value="${ciToEdit.phoneType}"> </br></br>
		Email: <input type="text" name="email" placeholder = "example@sample.com" value="${ciToEdit.email}"> </br></br>
		Email Type: <input type="text" name="emailType" placeholder = "personal/work" value="${ciToEdit.emailType}"> </br></br>
		<input type = "hidden" name = "id" value="${personToEdit.personId}">
		<input type = "submit" value="save updated person details">
	</form>
</body>
</html>
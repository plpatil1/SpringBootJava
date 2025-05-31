<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<h1>Student Form</h1>
<hr>
<form action="register.jsp" method="post">
<table>
<tr>
<td>Enter FirstName: </td>
<td><input type="text" name="firstName"></td>
</tr>
<tr>
<td>Enter LastName: </td>
<td><input type="text" name="lastName"></td>
</tr>
<tr>
<td>Enter Email-Id: </td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td> </td>
<td><input type="submit" value="Register"></td>
</tr>
</table>
</form>
</body>
</html>
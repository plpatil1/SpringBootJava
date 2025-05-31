<%@page import="com.app.dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="student" class="com.app.entity.Student"></jsp:useBean>
<jsp:setProperty property="*" name="student"/>
<%
	int i = StudentDAO.saveStudent(student);
	if(i>0)
	{
		out.write("Student Persisted!!"+i);
	}
	else
	{
		out.write("Failed to Persist Student!!");
	}
%>
</body>
</html>
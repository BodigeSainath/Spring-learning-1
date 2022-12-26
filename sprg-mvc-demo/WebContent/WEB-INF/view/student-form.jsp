<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring mvc form tgas</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First name : <form:input path="firstName"/><br/>
Last name : <form:input path="lastName"/><br/>
Country 
<form:select path="country">
<%-- <form:option value="IN">India</form:option>
<form:option value="US">USA</form:option>
<form:option value="UK">LONDON</form:option> --%>
<form:options items="${student.countries}"></form:options>
</form:select>
<br/>
Select lang<br/>
Java<form:radiobutton path="lang" value="java"/>
C++<form:radiobutton path="lang" value="c++"/>
Python<form:radiobutton path="lang" value="python"/>
<br/>
Select Course<br/>
<form:checkbox path="course" value="cse"/>CSE
<form:checkbox path="course" value="ece"/>ECE
<form:checkbox path="course" value="it"/>IT
<input type="submit" value="submit"><br/>
</form:form>
</body>
</html>
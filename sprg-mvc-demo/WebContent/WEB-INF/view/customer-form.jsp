<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration form</title>
<style>
  .error {color:red}
</style>
</head>
<body>
 <form:form action="processForm" modelAttribute="customer">
 First Name <form:input path="firstName"/><br/>
 
 Last Name <form:input path="lastName"/><br/>
 <form:errors path="lastName" cssClass="error"></form:errors><br/>
 Age <form:input path="age"/><br/>
 <form:errors path="age" cssClass="error"></form:errors>
 Pincode <form:input path="pin"/><br/>
 <form:errors path="pin" cssClass="error"></form:errors>
 courseCode <form:input path="courseCode"/><br/>
 <form:errors path="courseCode" cssClass="error"></form:errors>
 <input type="submit" value="submit"/>
 </form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
.formError {
	color: red;
}
.home
{
margin-left: auto;
margin-right: auto;
}
body {
  background-repeat: no-repeat;
  height: 100%;
  background-size: cover; 
  background-attachment: fixed;
  background-position: center;
  /* background-color:#4ac7ed; */
}
</style>
</head>
<body>
 <div class="container">
  <h1 align="center">Registration Form</h1>
  <br/>
  
  <form:form action="saveRegistrationForm" method="post" modelAttribute="users">
<table align="center">
    <tr>
    	<td><form:input path="userId" type="hidden" /></td>
    </tr>
     <tr>
    	<td>User Name</td>
    	<td><form:input path="userName"  cssClass="formInput" placeholder="Enter User Name"/></td>
    	<td><form:errors path="userName"  cssClass="formError"/></td>
    </tr>
     <tr>
    	<td>Last Name:</td>
    	<td><form:input path="email"  cssClass="formInput" placeholder="Enter Email"/></td>
    	<td><form:errors path="email"  cssClass="formError"/></td>
    </tr>
    <tr>
    	<td>Password</td>
    	<td><form:password path="password"  cssClass="formInput" placeholder="Enter password"/></td>
    	<td><form:errors path="password"  cssClass="formError"/></td>
    </tr>
    <tr>
    	<td>Role:</td>
    	<td><form:radiobutton path="role" value="M"/>Admin 
			<form:radiobutton path="role" value="F"/>User </td>
    	<td>
    </td>
    </tr>
    
    <tr><td align="right"><input type="submit" value="Submit"/></td><td align="left"><input type="reset" value="Reset"/></td></tr>
    </table>
 </form:form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.errors {
 color: red;
}
</style>
</head>
<body>
<form:form action="addUser" method="post" modelAttribute="user">
<table class="table table-striped">

<tr> <td>Enter id:</td><td><form:hidden path="userId" /></td></tr>
<tr><td>Enter Name</td><td><form:input path="userName" /></td><td><form:errors path="userName" cssClass="errors"></form:errors></td></tr>
<tr><td>Enter Address</td><td><form:input path="address" /></td></tr>
<tr><td>Enter password</td><td><form:password path="password" /></td><td><form:errors path="password" cssClass="errors"></form:errors></td></tr>
<tr><td><input type="reset" value="Reset" class="btn btn-primary"></td><td><input type="submit"  class="btn btn-secondary" value="Submit"></td></tr>

</table>
</form:form>
</body>
</html>
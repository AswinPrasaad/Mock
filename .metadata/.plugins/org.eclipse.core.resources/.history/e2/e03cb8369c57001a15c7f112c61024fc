<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
.error {
color: red;
font-style: italic;
}
</style>
</head>
<body>

  <h1 class="jumbotron" HEIGHT=100>Customer List</h1> 
  
  
 <table border="1" style="border-collapse: collapse">
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Country Name</th>
			
		</tr>

		<c:forEach var="customer" items="${customerlist}">
			<tr>
				<td><c:out value="${customer.customerId}"></c:out></td>
				<td><c:out value="${customer.customerName}"></c:out></td>
				<td><c:out value="${customer.customerAge}"></c:out></td>
				</tr>
		</c:forEach>
		</table>
  


</body>
</html>
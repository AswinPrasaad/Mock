<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Inventory</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
</head>
<body>

<h2>Book Search</h2>

<div class="container">
<form:form method="post" action="/findProduct" commandName="Search">
<input type="text" name="searchItem" class="form-control" placeholder="Search the products">
<button type="submit" name="save" class="btn btn-primary">Search</button>
</form:form>
</div>

	<table class="customerTable">
	
	<tr>
			<th width="130">Book Name</th>
			<th width="130">Description</th>
			<th width="130">Author</th>
			<th width="130">Price</th>
			<th width="130">Quantity</th>
			<th width="130">Add to Cart</th>
		</tr>
		<c:choose>

    <c:when test="${fn:length(bookList) > 0}">
		
		<c:forEach items="${bookList}" var="book">
			<tr>
				<td>${book.name}</td>
                <td>${book.description}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td>${book.quantity}</td>
                <td><a href="<c:url value='/cart'/>">Add to Cart</a>
				</td>
			</tr> 
		</c:forEach>
		    </c:when>

    <c:otherwise>

        <tr>

            <td colspan="8">No Books Found</td>



        </tr>

    </c:otherwise>

</c:choose>
		
	</table>

</body>
</html>
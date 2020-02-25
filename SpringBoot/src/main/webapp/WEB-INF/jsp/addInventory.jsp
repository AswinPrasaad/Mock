<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
	.error {
	color: red;
	font-style: italic;
	}
</style>
       <form:form method="post" action="save" modelAttribute="inventory"> 
        <h2 class="jumbotron" height=100 align="center">Add Inventory Page</h2> 
        <div align="center">
        <table>
         <tr>    
         <form:hidden path="id"></form:hidden> 
          <td>Book Name * : </td>   
          <td>
          	<form:input path="bookName" id="bookName" size="35" maxlength="30"/>
          	<form:errors path="bookName" cssClass="error"/>
          </td> 
          </tr>    
         
         <tr>    
          <td>Book Description :</td>    
          <td>
          	<form:input path="bookDescription"  id="bookDescription" size="35" maxlength="30"/>
          	<form:errors path="bookDescription" cssClass="error"/>
          </td>
          </tr>  
          
          <tr>    
          <td>Name of the Author *:</td>    
          <td>
          	<form:input path="author"  id="author" size="35" maxlength="30"/>
          	<form:errors path="author" cssClass="error"/>
          </td>
          </tr>  
          
          <tr>    
          <td>Quantity *:</td>    
          <td>
          	<form:input path="quantity"  id="quantity" size="6" maxlength="5"/>
          	<form:errors path="quantity" cssClass="error"/>
          </td>
          </tr>  
          
          <tr>    
          <td>Book Price *:</td>    
          <td>
          	<form:input path="price" id="price" size="8" maxlength="6"/>
          	<form:errors path="price" cssClass="error"/>
          </td>
          </tr>  
           
          <tr>    
          <td><br/></td>    
          <td><input type="submit" class="btn btn-success" value="Save Inventory" /></td>    
         </tr>    
        </table>   
        </div>
       </form:form>  
       <p align="center">${msg}</p>
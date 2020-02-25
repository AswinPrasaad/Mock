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
       <form:form method="post" action="save" modelAttribute="customer"> 
        <h1 class="jumbotron" HEIGHT=100>Add New Customer</h1> 
               <table  >    
         <tr>    
         <form:hidden path="customerId"></form:hidden> 
          <td>* Name : </td>   
          <td><form:input path="customerName" id="customerName"  /></td> 
          <td><form:errors path="customerName"  cssClass="error"/></td>
          </tr>    
         <tr>    
          <td>* Age :</td>    
          <td><form:input path="customerAge"  id="customerAge"/></td>
           <td><form:errors path="customerAge"  cssClass="error"/></td>
          </tr>   
          <tr>    
          <td><br/> </td>    
          <td><input type="submit" class="btn btn-success" value="Save" /></td>    
         </tr>    
        </table>   
       
       </form:form>  
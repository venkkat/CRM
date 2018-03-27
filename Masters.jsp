<%-- 
    Document   : Masters
    Created on : 22 Mar, 2018, 6:12:50 PM
    Author     : kishor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Information</title>
    </head>
    <body>
        
          <table border="1">
            <td><a href="Masters.jsp">Customer details</a></td>
            <td><a href="${pageContext.request.contextPath}/Allcustomers">All customers</a></td>            
        </table>
        <br />

        <form action="${pageContext.request.contextPath}/StudentServlet" method="POST">
         
        <table border="0">
                
                <tbody>
                    <tr>
                        <td>CustomerID:<input type="text" name="Name" value="${customer.CustomerID}" size="20"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Name:<input type="text" name="Name" value="${customer.Name}" size="20"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Address:<input type="text" name="Address" value="${customer.Address}" size="20"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Present Address:<input type="text" name="Present Address" value="${customer.PresentAddress}" size="20"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>State:<select name="state"value="${customer.State}"
                                <option>TamilNadu</option>
                                <option>Karnataka</option>
                                <option>Kerala</option>
                                <option>Goa</option>
                                <option>Madhya Pradhesh</option>
                            </select></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Country:<input type="text" name="Country" value="${customer.Country}" size="20"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Telephone:<input type="text" name="Telephone" value="${customer.Telephone}"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Mobile:<input type="text" name="Mobile" value="${customer.Mobile}" size="20"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Email:<input type="text" name="Email" value="${customer.Email}" size="20"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Contact person:<input type="text" name="Contactperson" value="${customer.Contactperson}" size="20"/></td>
                        <td></td>
                        
               
                    </tr>
                    <tr>
                        <td>Gender:<input type="radio" name="Gender" value="Male" />Male
                <input type="radio"name="Gender"value="Female" />Female
                 </td>
                   </tr>
            <tr> 
                <td colspan="2"><input type="submit"value="Add" name="Add"/>
                    <input type="submit"name="operation"value="Edit"/>
                    <input type="submit"name="operation"value="Delete"/>
                    <input type="submit"name="operation"value="Search"/></td>
                
            </tr>
            </tbody>
            </table>
                        
    </body>
</html>

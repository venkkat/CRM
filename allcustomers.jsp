<%-- 
    Document   : allcustomers
    Created on : 26 Mar, 2018, 1:33:23 PM
    Author     : kishor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All customers</title>
    </head>
    <body>
         <table border="1">
            <td><a href="Masters.jsp">Customer Details</a></td>
            <td><a href="allcustomers.jsp">All Customers</a></td>            
        </table>
        <br />
        <h3>List of Customers</h3>
        <br />
        <table border="1">
            <th>Customer ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Present Address</th>
            <th>State</th>
            <th>Country</th>
            <th>Telephone</th>
            <th>Mobile</th>
            <th>Email</th>
            <th>Contact person</th>
            <c:forEach items="${requestScope.list}" var="customer">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/GetCustomer?id=${customer.CustomerID}">${customer.CustomerID}</a></td>
                    <td>${customer.Name}</td>
                    <td>${customer.Address}</td>
                    <td>${customer.PresentAddress}</td>
                     <td>${customer.State}</td>
            <td>${customer.Country}</td>
            <td>${customer.Telephone}</td>
            <td>${customer.Mobile}</td>
            <td>${customer.Email}</td>
            <td>${customer.Contactperson}</td>
                </tr>
            </c:forEach>                 
        </table>
    </body>
</html>

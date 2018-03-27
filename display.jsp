<%-- 
    Document   : display
    Created on : 22 Mar, 2018, 6:23:00 PM
    Author     : kishor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer</title>
    </head>
    <body>
        <%
          String Name=request.getParameter("Name");
          String Address=request.getParameter("Address");
          String PresentAddress=request.getParameter("Present Address");
          String State=request.getParameter("state");
          String Country=request.getParameter("Country");
          int Telephone=Integer.parseInt(request.getParameter("Telephone"));
          int Mobile=Integer.parseInt(request.getParameter("Mobile"));
          String Email=request.getParameter("Email");
          String Contactperson=request.getParameter("Contactperson");
          
            %>
            <table border="1">
               
                <tbody>
                    <tr>
                        <td>Name:</td>
                        <td><%= Name %></td>
                    </tr>
                    <tr>
                        <td>Address:</td>
                        <td><%= Address %></td>
                    </tr>
                    <tr>
                        <td>Present Address:</td>
                        <td><%= PresentAddress %></td>
                    </tr>
                    <tr>
                        <td>State:</td>
                        <td><%= State %></td>
                    </tr>
                    <tr>
                        <td>Country:</td>
                        <td><%= Country %></td>
                    </tr>
                    <tr>
                        <td>Telephone:</td>
                        <td><%= Telephone %></td>
                    </tr>
                    <tr>
                        <td>Mobile:</td>
                        <td><%= Mobile %></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><%= Email %></td>
                    </tr>
                    <tr>
                        <td>Contactperson:</td>
                        <td><%= Contactperson %></td>
                    </tr>
                </tbody>
            </table>
    </body>
</html>

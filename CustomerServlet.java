/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.customer;
import model.ejb.CustomerDAO;
import model.ejb.CustomerDAO.Customer;

/**
 *
 * @author kishor
 */
@WebServlet(name = "CustomerServlet", urlPatterns = {"/CustomerServlet"})
public class CustomerServlet extends HttpServlet {
@EJB private CustomerDAO customerDAO;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String CustomerID = request.getParameter("id");
        String Name = request.getParameter("Name");
        String Address = request.getParameter("Address");
        String PresentAddress=request.getParameter("PresentAddress");
        String State=request.getParameter("State");
        String Country=request.getParameter("Country");
        String Telephone=request.getParameter("Telephone");
        String Mobile=request.getParameter("Mobile");
        String Email=request.getParameter("Email");
        String ContactPerson=request.getParameter("ContactPerson");
        String operation = request.getParameter("operation");

        Customer customer = new Customer(CustomerID, Name, Address,PresentAddress,State,Country,Telephone,Mobile,Email,ContactPerson);

        if (operation.equalsIgnoreCase("Add")) {
            CustomerDAO.addcustomer(customer);
            request.setAttribute("customer", customer);
        } else if (operation.equalsIgnoreCase("Edit")) {
            CustomerDAO.editcustomer(customer);
            customer searchedCustomer = CustomerDAO.getcustomer(CustomerID);
            request.setAttribute("customer", searchedCustomer);
        } else if (operation.equalsIgnoreCase("Delete")) {
            CustomerDAO.deletecustomer(CustomerID);
        } else if (operation.equalsIgnoreCase("Search")) {
            Customer searchedcustomer = CustomerDAO.getCustomer(CustomerID);
            request.setAttribute("customer", searchedCustomer);
        }
        request.getRequestDispatcher("Masters.jsp").forward(request, response);
    }
    }
    

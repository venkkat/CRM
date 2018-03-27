/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ejb;





import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.resource.cci.ResultSet;
import javax.sql.DataSource;
import model.customer;

/**
 *
 * @author kishor
 */
@Stateless
@LocalBean
public class CustomerDAO {

    public static void deletecustomer(String CustomerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @PersistenceContext private EntityManager em;

    public static void addcustomer(controller.Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void editcustomer(controller.Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static customer getCustomer(String CustomerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void deleteCustomer(String CustomerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void addcustomer(controller.Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void editcustomer(controller.Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void Addcustomer(controller.Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
@Resource(name="jdbc/CustomerDB")
private DataSource ds;

public void addCustomer(Customer customer){
    String sql="INSERT INTO CUSTOMER VALUE('"+ customer.getCustomerID() +"','"+ customer.getName() +"','"+customer.getAddress() +"','"+customer.getPresentAddress()+"','"+customer.getState()+"','"+customer.getCountry()+"','"+customer.Telephone()+"','"+customer.getMobile()+"','"+customer.getEmail()+"','"+customer.getContactPerson()+"')";
    executeModifyQuery(sql);}
public void editCustomer(Customer customer){
    String sql="UPDATE CUSTOMER SET Name='"+ customer.getName() +"',Address='"+customer.getAddress() +"',Present Address='"+customer.getPresentAddress()+"',State='"+customer.getState()+"',Country='"+customer.getCountry()+"',Telephone='"+customer.Telephone()+"',Mobile='"+customer.getMobile()+"',Email='"+customer.getEmail()+"',ContactPerson='"+customer.getContactPerson()+"' WHERE CustomerID='"+ customer.getCustomerID()+"')";
    executeModifyQuery(sql);}
public void deleteCustomer(Customer customer){
    String sql="DELETE FROM CUSTOMER WHERE CUSTOMERID='"+ customer.getCustomerID() +"'";
    executeModifyQuery(sql);       
}
public Customer getCustomer(String id){
    Customer customer=new Customer();
    String sql="SELECT * FROM CUSTOMER WHERE CUSTOMERID='"+id+"'";
    System.out.println(sql);
    ResultSet rs = executeFetchQuery(sql);
    try{
        if(rs.next()){
            customer.setCustomerID(rs.getString("CustomerID"));
            customer.setName(rs.getString("Name"));
            customer.setAddress(rs.getString("Address"));
            customer.setPresentAddress(rs.getString("PresentAddress"));
        customer.setState(rs.getString("State"));
    customer.setCountry(rs.getString("Country"));
customer.setTelephone(rs.getString("Telephone"));
customer.setMobile(rs.getString("Mobile"));
customer.setEmail(rs.getString("Email"));
customer.setContactPerson(rs.getString("ContactPerson"));
        }}
        catch(Exception ex)
        {
                System.out.println("GS"+ex.getMessage());
                }
    return customer;
}
public ArrayList<Customer> getAllcustomer() throws SQLException{
   ArrayList<Customer> list=new ArrayList<Customer>();
   String sql="SELECT * FROM CUSTOMER";
   ResultSet rs = executeFetchQuery(sql);
   try 
   {
       while(rs.next()){
           Customer customer=new Customer();
           customer.setCustomerID(rs.getString("CustomerID"));
           customer.setName(rs.getString("Name"));
           customer.setAddress(rs.getString("Address"));
           customer.setPresentAddress(rs.getString("PresentAddress"));
            customer.setState(rs.getString("State"));
    customer.setCountry(rs.getString("Country"));
customer.setTelephone(rs.getString("Telephone"));
customer.setMobile(rs.getString("Mobile"));
customer.setEmail(rs.getString("Email"));
customer.setContactPerson(rs.getString("ContactPerson"));
list.add(customer);
       }
   }
    catch(SQLException ex)
    {
       System.err.println(ex.getMessage());
    }
   return list;
}

 public void executeModifyquery(String sql )  
 {
     try{
      Connection conn=ds.getConnection();
      conn.createStatement().execute(sql);
      conn.close();
     }catch(Exception e)
     {
         System.err.println(e.getMessage());
     }
 }
 public ResultSet executeFetchquery(String sql )  
 {
     ResultSet rs=null;
     try{
      Connection conn=ds.getConnection();
     rs=(ResultSet) conn.createStatement().executeQuery(sql);
      conn.close();
     }catch(Exception e)
     {
         System.err.println(e.getMessage());
     }
     return rs;
 }

    private void executeModifyQuery(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ResultSet executeFetchQuery(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAllcustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class Customer {

        public Customer() {
        }

        public Customer(String CustomerID, String Name, String Address, String PresentAddress, String State, String Country, String Telephone, String Mobile, String Email, String ContactPerson) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getCustomerID() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getName() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getAddress() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getPresentAddress() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getState() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getCountry() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String Telephone() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getMobile() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getEmail() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getContactPerson() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setCustomerID(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setName(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setAddress(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setPresentAddress(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setState(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setCountry(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setTelephone(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setMobile(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setEmail(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setContactPerson(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    
}

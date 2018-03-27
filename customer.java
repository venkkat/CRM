/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kishor
 */
public class customer {
            private String CustomerID;
            private String Name;
            private String Address;
            private String PresentAddress;
            private String State;
           private String Country;
            private int Telephone;
            private int Mobile;
            private String Email;
            private  String ContactPerson;

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPresentAddress() {
        return PresentAddress;
    }

    public void setPresentAddress(String PresentAddress) {
        this.PresentAddress = PresentAddress;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    public int getMobile() {
        return Mobile;
    }

    public void setMobile(int Mobile) {
        this.Mobile = Mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContactPerson() {
        return ContactPerson;
    }

    public void setContactperson(String Contactperson) {
        this.ContactPerson = ContactPerson;
    }
            
    
    public customer(String CustomerID, String Name, String Address,String PresentAddress,String State,String Country,int Telephone,int Mobile,String Email,String ContactPerson) {
        this.CustomerID = CustomerID;
        this.Name = Name;
        this.Address = Address;
        this.PresentAddress =PresentAddress;
        this.State =State;
        this.Country =Country;
        this.Telephone =Telephone;
        this.Mobile =Mobile;
        this.Email =Email;
        this.ContactPerson =ContactPerson;
    }
    public customer(){}
}

   

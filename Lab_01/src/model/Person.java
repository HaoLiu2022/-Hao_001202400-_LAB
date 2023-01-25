/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author haoliu
 */
public class Person {
    
    private String NUID;
    private String firstName;
    private String lastName;
    private String collegeName;
    private Address address;
    private String phoneNumber;
    private String emailAddress;
    

    public Person() {
        this.NUID = "";
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        this.address = new Address();
        this.phoneNumber = "";
        this.emailAddress = "";
    }
    
    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
        /**
     * @return the NUID
     */
    public String getNUID() {
        return NUID;
    }

    /**
     * @param NUID the NUID to set
     */
    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the collegeName
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * @param collegeName the collegeName to set
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
        /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public static void main(String args[]) {
        Person obj = new Person();
        obj.setNUID("001202400");
        obj.setFirstName("Hao");
        obj.setLastName("Liu");
        obj.setCollegeName("NEU");
        obj.setPhoneNumber("8573038087");
        obj.setEmailAddress("liu.hao5@northeastern.edu");
        
        Address addr = obj.getAddress();
        obj.setAddress(addr);
        
    }  
    
}

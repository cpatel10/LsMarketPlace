package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;

import javax.persistence.Entity;
import java.util.Date;
import java.util.ArrayList;

/**
 * Created by annezhao on 9/16/16.
 */

@Entity
public class User extends BaseModel {
    private String firstName;
    private String middleName;
    private String lastName;
    private char gender;   // F or M
    private Date dateOfBirth;

    private boolean isSeller;  // 0 or 1,  to authenticate selling privilege enabled or not

    private String email;   // login name
    private String password;    // password

    private ArrayList<Address> addresses;
    private ArrayList<Contact> contacts;
    private ArrayList<Payment> payments;



    // getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isSeller() {
        return isSeller;
    }

    public void setSeller(boolean seller) {
        isSeller = seller;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }
}

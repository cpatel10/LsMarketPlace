package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;
import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by annezhao on 9/16/16.
 */
@Entity
public class Address extends BaseModel {

    @NotNull
    private long userID;

    private String Line1;
    private String Line2;
    private String city;
    private String state;
    private String zipCode;
    private String addressType;



    // getters and setters

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getLine1() {
        return Line1;
    }

    public void setLine1(String line1) {
        Line1 = line1;
    }

    public String getLine2() {
        return Line2;
    }

    public void setLine2(String line2) {
        Line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
}

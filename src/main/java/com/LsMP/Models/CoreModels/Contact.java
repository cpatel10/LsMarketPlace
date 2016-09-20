package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;
import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;

/**
 * Created by annezhao on 9/16/16.
 */

@Entity
public class Contact extends BaseModel {
    @NotNull
    private long userID;

    private String contactType;
    private String contactNumber;


    // getters and setters

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}

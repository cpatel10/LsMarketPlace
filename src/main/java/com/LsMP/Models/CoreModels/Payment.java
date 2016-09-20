package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;

import javax.persistence.Entity;

/**
 * Created by annezhao on 9/16/16.
 */
@Entity
public class Payment extends BaseModel {
    private String paymentType;
    private String accountNumber;
    private String accountName;
    private String accoutExpire;  // format: mm/dd
    private String accountCVV;  // last three digit of credit and debit card



    // getters and setters

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccoutExpire() {
        return accoutExpire;
    }

    public void setAccoutExpire(String accoutExpire) {
        this.accoutExpire = accoutExpire;
    }

    public String getAccountCVV() {
        return accountCVV;
    }

    public void setAccountCVV(String accountCVV) {
        this.accountCVV = accountCVV;
    }
}

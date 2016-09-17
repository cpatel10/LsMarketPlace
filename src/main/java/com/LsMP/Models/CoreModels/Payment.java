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


}

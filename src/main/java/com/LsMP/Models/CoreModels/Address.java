package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;

import javax.persistence.Entity;

/**
 * Created by annezhao on 9/16/16.
 */
@Entity
public class Address extends BaseModel{
    private String Line1;
    private String Line2;
    private String city;
    private String state;
    private String zipCode;
}

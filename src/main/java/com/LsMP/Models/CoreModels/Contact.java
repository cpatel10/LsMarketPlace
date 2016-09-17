package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;

import javax.persistence.Entity;

/**
 * Created by annezhao on 9/16/16.
 */

@Entity
public class Contact extends BaseModel{
    private String contactType;
    private String contactNumber;
}

package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by annezhao on 9/16/16.
 */

@Entity
public class Product extends BaseModel {
    private String productName;
    private long sellerID;
    private String description;
    private float price;

    private Date producedDate;
    private Date expireDate;

    private int category;
}

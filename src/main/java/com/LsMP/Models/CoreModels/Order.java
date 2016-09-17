package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;

import javax.persistence.Entity;
import java.util.ArrayList;

/**
 * Created by annezhao on 9/16/16.
 */

@Entity
public class Order extends BaseModel {
    private long userID;
    private float priceTotal;

    private Address shippingAddress;
    private Payment payment;

    private ArrayList<Product> itemList;  // a list of products in this order

}

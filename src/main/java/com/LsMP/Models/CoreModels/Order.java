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

    private ArrayList<Product> itemList; // a list of products in this order

    private float priceTotal;

    private int shippingType; // 0 - self-pickup, 1 - shipping
    private Address shippingAddress;

    private Payment payment;

    private int orderStatus;  // 0 - processing, 1 - shipped, 2 - canceled
    private String comments;





    // getters and setters
    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public ArrayList<Product> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Product> itemList) {
        this.itemList = itemList;
    }

    public float getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(float priceTotal) {
        this.priceTotal = priceTotal;
    }

    public int getShippingType() {
        return shippingType;
    }

    public void setShippingType(int shippingType) {
        this.shippingType = shippingType;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

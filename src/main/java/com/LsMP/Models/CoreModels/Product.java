package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by annezhao on 9/16/16.
 */

@Entity
public class Product extends BaseModel {
    private String productName;
    private long sellerID;  // regarding to userID
    private String productIdentifier;
    private String producer;
    private String category;
    private float price;
    private int amount;

    private Date producedDate;
    private Date expireDate;

    private String size;
    private String weight;
    private String color;
    private String description;

    private ArrayList<Review> reviews;
    private float aveOverallRating;
    private float aveShippingRating;




    // getters and setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getSellerID() {
        return sellerID;
    }

    public void setSellerID(long sellerID) {
        this.sellerID = sellerID;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(Date producedDate) {
        this.producedDate = producedDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public float getAveOverallRating() {
        return aveOverallRating;
    }

    public void setAveOverallRating(float aveOverallRating) {
        this.aveOverallRating = aveOverallRating;
    }

    public float getAveShippingRating() {
        return aveShippingRating;
    }

    public void setAveShippingRating(float aveShippingRating) {
        this.aveShippingRating = aveShippingRating;
    }

    public float getAveDescriptionRating() {
        return aveDescriptionRating;
    }

    public void setAveDescriptionRating(float aveDescriptionRating) {
        this.aveDescriptionRating = aveDescriptionRating;
    }

    public float getAveProuctRating() {
        return aveProuctRating;
    }

    public void setAveProuctRating(float aveProuctRating) {
        this.aveProuctRating = aveProuctRating;
    }

    private float aveDescriptionRating;
    private float aveProuctRating;
}

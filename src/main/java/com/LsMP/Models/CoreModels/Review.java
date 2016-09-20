package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;

/**
 * Created by annezhao on 9/19/16.
 */
public class Review extends BaseModel {
    private long productID;
    private long userID;

    private int shippingRating;
    private int descriptionRating;
    private int productRating;

    private String ratingComments;



    // getters and setters

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public int getShippingRating() {
        return shippingRating;
    }

    public void setShippingRating(int shippingRating) {
        this.shippingRating = shippingRating;
    }

    public int getDescriptionRating() {
        return descriptionRating;
    }

    public void setDescriptionRating(int descriptionRating) {
        this.descriptionRating = descriptionRating;
    }

    public int getProductRating() {
        return productRating;
    }

    public void setProductRating(int productRating) {
        this.productRating = productRating;
    }

    public String getRatingComments() {
        return ratingComments;
    }

    public void setRatingComments(String ratingComments) {
        this.ratingComments = ratingComments;
    }
}

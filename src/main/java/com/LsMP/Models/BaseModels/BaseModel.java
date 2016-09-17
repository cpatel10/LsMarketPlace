package com.LsMP.Models.BaseModels;

import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;

/**
 * Created by annezhao on 9/16/16.
 */

// This model is inherited by every other model

@Entity
public class BaseModel {
    @NotNull
    private long ID;
    @NotNull
    private String createdTime;

    public long getID() {
        return ID;
    }
    public void setID(long ID) {
        this.ID = ID;
    }

    public String getCreatedTime() {
        return createdTime;
    }
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }
}

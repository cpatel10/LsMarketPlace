package com.LsMP.Models.CoreModels;

import com.LsMP.Models.BaseModels.BaseModel;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by annezhao on 9/16/16.
 */

@Entity
public class User extends BaseModel{
    private String firstName;
    private String middleName;
    private String lastName;
    private char gender;   // F or M
    private Date dateOfBirth;

    private boolean isSeller;  // 0 or 1,  to authenticate selling privilege enabled or not

    private String email;   // login name
    private String password;    // password
}

package com.example.AllBanks.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//
@Data

@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private long userID;
    private String userName;
    private String userPassword;
    private String emailID;
    private String phoneNumber;





}

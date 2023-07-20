package com.example.AllBanks.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {

    private long account_ID;

    private UserEntity userID;

    private String accountNumber;
    private double balance;

}

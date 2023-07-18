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

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="user_id")
    private UserEntity userId;

    private String accountNumber;
    private double balance;

}

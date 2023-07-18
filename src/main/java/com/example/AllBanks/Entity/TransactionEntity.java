package com.example.AllBanks.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data

@NoArgsConstructor
@AllArgsConstructor
public class TransactionEntity {

    private long transactionId;
    private AccountEntity account_ID;
    private String transactionType;
    private double amount;
    private LocalDate transactionDate ;

}

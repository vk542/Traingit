package com.example.demo.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table
public class Account {

    @Id
  //  @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long accountNum;

    public String getAcc_holder_name() {
        return acc_holder_name;
    }

    public void setAcc_holder_name(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }

    @Column
    private String acc_holder_name;
    @Column
    private Double acc_balance;


    public Long getAccountNum() {
        return accountNum;
    }

    public Double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(Double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public void setAccountNum(Long accountNum) {
        this.accountNum = accountNum;
    }
}

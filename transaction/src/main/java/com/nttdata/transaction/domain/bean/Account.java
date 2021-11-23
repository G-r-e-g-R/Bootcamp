package com.nttdata.transaction.domain.bean;

import lombok.Data;

@Data
public class Account {
    private String id;
    private AccountType accountType;
    private String name;
    private Long commission;
    private int limitMovement;
}

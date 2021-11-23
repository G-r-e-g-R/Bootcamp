package com.nttdata.transaction.domain.bean;

import lombok.Data;

@Data
public class Credit {
    private String id;
    private CreditType creditType;
    private int maximumNumberCredit;
    private String cardNumber;
    private Long creditLimit;
}

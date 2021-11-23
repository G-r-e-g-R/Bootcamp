package com.nttdata.transaction.domain.bean;

import lombok.Data;

@Data
public class Customer {
    private String code;
    private CustomerType customerType;
    private DocumentType documentType;
    private String documentNumber;
    private String name;
    private String state;
}

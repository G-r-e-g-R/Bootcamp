package com.nttdata.customer.domain;

import lombok.Data;

/**
 * CUSTOMER: La clase customer contendrá  información de los clientes Personales y Empresariales
 */
@Data
public class Customer {
    private String code;
    private CustomerType customerType;
    private DocumentType documentType;
    private String documentNumber;
    private String name;
    private String state;
}

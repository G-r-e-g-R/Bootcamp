package com.nttdata.product.domain;

import lombok.Data;
/**
 * ACCOUNT: La clase contendrá  información de las cuentas Bancarias (AHORRO, CUENTA CORRIENTE y PLAZO FIJO)
 */
@Data
public class Account {

    private String id;
    private AccountType accountType;
    private String name;
    private Long commission;
    private int limitMovement;

}

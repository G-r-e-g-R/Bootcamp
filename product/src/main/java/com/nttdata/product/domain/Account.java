package com.nttdata.product.domain;

import lombok.Data;
/**
 * ACCOUNT: La clase contendrá  información de las cuentas Bancarias (AHORRO, CUENTA CORRIENTE y PLAZO FIJO)
 */
@Data
public class Account {

    private String id;
    private AccountType accountType;
    private String number;
    private Long commission;
    private int limitMovement;
    private String movementDay;
    private int numberOfHolder;
    private int numberOfSigner;

}

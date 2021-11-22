package com.nttdata.product.domain;

import lombok.Data;
/**
 * CREDIT: La clase contendrá  información de los Creditos (PERSONAL, EMPRESARIAL y TARJETAS DE CREDITO)
 */
@Data
public class Credit {

    private String id;
    private CreditType creditType;
    private int maximumNumberCredit;
    private String cardNumber;
    private Long creditLimit;
}

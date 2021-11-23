package com.nttdata.transaction.domain;


import com.nttdata.transaction.domain.bean.Credit;
import com.nttdata.transaction.domain.bean.Customer;
import lombok.Data;

/**
 * CREDITAFFILIATION: La clase Afiliación de Creditos contendrá  información del
 *                    registro de un credito de un cliente
 */
@Data
public class CreditAffiliation {
    private String id;
    private Customer customer;
    private Credit credit;
    private Double baseAmount;
    private Double balance;
}

package com.nttdata.transaction.domain;

import com.nttdata.transaction.domain.bean.Account;
import com.nttdata.transaction.domain.bean.Customer;
import lombok.Data;


/**
 * ACCOUNTAFFILIATION: La clase Afiliación de Cuenta Bancarias contendrá  información del
 *                     registro de una cuenta bancaria de un cliente
 */
@Data
public class AccountAffiliation {
    private String id;
    private String idCustomer;
    private String idAccount;
    private Customer customer;
    private Account account;
    private String number;
    private String movementDay;
    private int numberOfHolder;
    private int numberOfSigner;
    private Double baseAmount;
    private Double balance;
    private String status;

}

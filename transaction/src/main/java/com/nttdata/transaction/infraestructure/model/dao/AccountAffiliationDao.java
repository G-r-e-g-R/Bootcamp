package com.nttdata.transaction.infraestructure.model.dao;

import com.nttdata.transaction.domain.bean.Account;
import com.nttdata.transaction.domain.bean.Customer;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * ACCOUNTAFFILIATIONDAO: Contiene los atributos del documento Afiliación de cuentas bancarias
 *                        (accountAffiliation) para la persistencia
 */
@Data
@Document("accountAffiliation")
public class AccountAffiliationDao {
    @Id
    private String id;
    private String idCustomer;
    private String idAccount;
    @Transient
    private Customer customer;
    @Transient
    private Account account;
    private String number;
    private String movementDay;
    private int numberOfHolder;
    private int numberOfSigner;
    private Double baseAmount;
    private Double balance;
    private String status;
}

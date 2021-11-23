package com.nttdata.product.infraestructure.model.dao;

import com.nttdata.product.domain.AccountType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;
/**
 * ACCOUNTDAO: Contiene los atributos del documento Cuenta (Account) para la persistencia
 */
@Data
@Document("account")
public class AccountDao {
    @Id
    private String id;
    private AccountType accountType;
    private String name;
    private Long commission;
    private int limitMovement;
}

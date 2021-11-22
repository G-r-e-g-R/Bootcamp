package com.nttdata.product.infraestructure.model.dao;

import com.nttdata.product.domain.CreditType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
/**
 * ACREDITDAO: Contiene los atributos del documento Credito (Credit) para la persistencia
 */
@Data
@Document("credit")
public class CreditDao {
    @Id
    private String id;
    private CreditType creditType;
    private int maximumNumberCredit;
    private String cardNumber;
    private Long creditLimit;
}

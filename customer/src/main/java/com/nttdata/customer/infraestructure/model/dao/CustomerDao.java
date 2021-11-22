package com.nttdata.customer.infraestructure.model.dao;

import com.nttdata.customer.domain.CustomerType;
import com.nttdata.customer.domain.DocumentType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * CUSTOMERDAO: Contiene los atributos del documento Cliente (Customer) para la persistencia
 */
@Data
@Document("customer")
public class CustomerDao {
    @Id
    private String code;
    private CustomerType customerType;
    private DocumentType documentType;
    private String documentNumber;
    private String name;
    private String state;
}

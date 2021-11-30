package com.nttdata.transaction.infraestructure.client;

import com.nttdata.transaction.domain.bean.Customer;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
@Component
public class CustomerHystrixFallbackFactory implements  CustomerClient{
    @Override
    public Mono<Customer> getById(String code) {
        Customer customer = new Customer();
        customer.setName("None");
        customer.setState("None");
        customer.setDocumentNumber("None");
        customer.setCode("0");
        Mono<Customer> customerMono = Mono.just(customer);
        return null;
    }
}

package com.nttdata.transaction.infraestructure.client;

import com.nttdata.transaction.domain.bean.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;
@FeignClient(name = "customer")
@RequestMapping("/customers")
public interface CustomerClient {
    @GetMapping("/{code}")
    public Mono<Customer> getById(@PathVariable String code);
}

package com.newSpring.App.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private static final List<Customer> CUSTOMERS = List.of(
            new Customer(1L, "sam", "david", "sam@harks.com"),
            new Customer(2L, "david", "bila", "david@harks.com"),
            new Customer(3L, "raja", "sekar","raja@harks.com"),
            new Customer(4L, "dunny","duncan","dunny@harks.com")
    );

    @GetMapping
    public List<Customer> findAllCustomers(){
        return CUSTOMERS;
    }
}

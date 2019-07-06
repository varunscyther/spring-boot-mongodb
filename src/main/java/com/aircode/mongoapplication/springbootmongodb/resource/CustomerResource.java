package com.aircode.mongoapplication.springbootmongodb.resource;

import com.aircode.mongoapplication.springbootmongodb.document.Customer;
import com.aircode.mongoapplication.springbootmongodb.respository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class CustomerResource {


    private CustomerRepository repository;

    public CustomerResource(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    public List<Customer> getAll() {
        List<Customer> customer = repository.findAll();
        return customer;
    }

}

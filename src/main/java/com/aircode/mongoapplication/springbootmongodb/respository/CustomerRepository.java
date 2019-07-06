package com.aircode.mongoapplication.springbootmongodb.respository;


import com.aircode.mongoapplication.springbootmongodb.document.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}

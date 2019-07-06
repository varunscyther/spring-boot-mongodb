package com.aircode.mongoapplication.springbootmongodb.config;

import com.aircode.mongoapplication.springbootmongodb.respository.CustomerRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses= CustomerRepository.class)
@Configuration
public class MongoDBConfig {

}

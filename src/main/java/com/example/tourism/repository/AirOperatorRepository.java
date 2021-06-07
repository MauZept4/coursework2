package com.example.tourism.repository;


import com.example.tourism.model.AirOperator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirOperatorRepository extends MongoRepository<AirOperator, String > {
}

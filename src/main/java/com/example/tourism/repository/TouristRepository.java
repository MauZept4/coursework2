package com.example.tourism.repository;

import com.example.tourism.model.Tourist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  TouristRepository extends MongoRepository<Tourist, String > {
}

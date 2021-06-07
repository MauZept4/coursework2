package com.example.tourism.repository;

import com.example.tourism.model.touristDoc;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristDocRepository extends MongoRepository<touristDoc, String > {
}

package com.example.tourism.repository;

import com.example.tourism.model.Luggage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LuggageRepository extends MongoRepository<Luggage, String > {
}

package com.example.tourism.repository;

import com.example.tourism.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends MongoRepository<Country, String > {
}

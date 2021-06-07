package com.example.tourism.repository;

import com.example.tourism.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String > {
}

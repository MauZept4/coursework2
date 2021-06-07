package com.example.tourism.repository;

import com.example.tourism.model.Activities;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitiesRepository extends MongoRepository<Activities, String > {
}

package com.example.tourism.repository;

import com.example.tourism.model.Expenses;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensesRepository extends MongoRepository<Expenses, String > {
}

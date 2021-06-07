package com.example.tourism.service.luggage.interfaces;

import com.example.tourism.model.Luggage;

import java.util.List;

public interface ILuggageService {
    Luggage getById(String id);
    Luggage create(Luggage luggage);
    Luggage update(Luggage luggage);
    Luggage delete(String id);
    List<Luggage> getAll();
}

package com.example.tourism.service.tourist.interfaces;

import com.example.tourism.model.Tourist;

import java.util.List;

public interface ITouristService {
    Tourist getById(String id);
    Tourist create(Tourist tourist);
    Tourist update(Tourist tourist);
    Tourist delete(String id);
    List<Tourist> getAll();
}

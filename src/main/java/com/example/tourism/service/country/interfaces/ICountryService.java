package com.example.tourism.service.country.interfaces;

import com.example.tourism.model.Country;

import java.util.List;

public interface ICountryService {
    Country getById(String id);
    Country create(Country country);
    Country update(Country country);
    Country delete(String id);
    List<Country> getAll();
}

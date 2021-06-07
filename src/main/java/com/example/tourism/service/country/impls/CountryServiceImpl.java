package com.example.tourism.service.country.impls;

import com.example.tourism.model.Country;
import com.example.tourism.repository.CountryRepository;
import com.example.tourism.service.country.interfaces.ICountryService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CountryServiceImpl implements ICountryService {
    final CountryRepository repository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.repository = countryRepository;
    }


    @Override
    public Country getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Country create(Country country) {
        return repository.save(country);
    }

    @Override
    public Country update(Country country) {
        return repository.save(country);
    }

    @Override
    public Country delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Country> getAll() {
        return repository.findAll();
    }
}

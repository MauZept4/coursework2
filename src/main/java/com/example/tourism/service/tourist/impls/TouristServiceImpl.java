package com.example.tourism.service.tourist.impls;

import com.example.tourism.model.Tourist;
import com.example.tourism.repository.TouristRepository;
import com.example.tourism.service.tourist.interfaces.ITouristService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class TouristServiceImpl implements ITouristService {
    final TouristRepository repository;

    public TouristServiceImpl(TouristRepository touristRepository) {
        this.repository = touristRepository;
    }


    @Override
    public Tourist getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Tourist create(Tourist tourist) {
        return repository.save(tourist);
    }

    @Override
    public Tourist update(Tourist tourist) {
        return repository.save(tourist);
    }

    @Override
    public Tourist delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Tourist> getAll() {
        return repository.findAll();
    }
}

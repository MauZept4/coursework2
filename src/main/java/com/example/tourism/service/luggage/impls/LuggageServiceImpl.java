package com.example.tourism.service.luggage.impls;

import com.example.tourism.model.Luggage;
import com.example.tourism.repository.LuggageRepository;
import com.example.tourism.service.luggage.interfaces.ILuggageService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class LuggageServiceImpl implements ILuggageService {
    final LuggageRepository repository;

    public LuggageServiceImpl(LuggageRepository luggageRepository) {
        this.repository = luggageRepository;
    }


    @Override
    public Luggage getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Luggage create(Luggage luggage) {
        return repository.save(luggage);
    }

    @Override
    public Luggage update(Luggage luggage) {
        return repository.save(luggage);
    }

    @Override
    public Luggage delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Luggage> getAll() {
        return repository.findAll();
    }
}

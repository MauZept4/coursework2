package com.example.tourism.service.touristdoc.impls;

import com.example.tourism.model.touristDoc;
import com.example.tourism.repository.TouristDocRepository;
import com.example.tourism.service.touristdoc.interfaces.ITouristDocService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class TouristDocServiceImpl implements ITouristDocService {
    final TouristDocRepository repository;

    public TouristDocServiceImpl(TouristDocRepository touristDocRepository) {
        this.repository = touristDocRepository;
    }


    @Override
    public touristDoc getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public touristDoc create(touristDoc touristDoc) {
        return repository.save(touristDoc);
    }

    @Override
    public touristDoc update(touristDoc touristDoc) {
        return repository.save(touristDoc);
    }

    @Override
    public touristDoc delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<touristDoc> getAll() {
        return repository.findAll();
    }
}

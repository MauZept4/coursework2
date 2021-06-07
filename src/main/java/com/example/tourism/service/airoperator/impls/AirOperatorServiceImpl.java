package com.example.tourism.service.airoperator.impls;

import com.example.tourism.model.AirOperator;
import com.example.tourism.repository.AirOperatorRepository;
import com.example.tourism.service.airoperator.interfaces.IAirOperatorService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class AirOperatorServiceImpl implements IAirOperatorService {
    final AirOperatorRepository repository;

    public AirOperatorServiceImpl(AirOperatorRepository repository) {
        this.repository = repository;
    }


    @Override
    public AirOperator getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public AirOperator create(AirOperator airOperator) {
        return repository.save(airOperator);
    }

    @Override
    public AirOperator update(AirOperator airOperator) {
        return repository.save(airOperator);
    }

    @Override
    public AirOperator delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<AirOperator> getAll() {
        return repository.findAll();
    }
}

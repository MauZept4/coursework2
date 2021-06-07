package com.example.tourism.service.airoperator.interfaces;

import com.example.tourism.model.AirOperator;

import java.util.List;

public interface IAirOperatorService {
    AirOperator getById(String id);
    AirOperator create(AirOperator airOperator);
    AirOperator update(AirOperator airOperator);
    AirOperator delete(String id);
    List<AirOperator> getAll();
}

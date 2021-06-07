package com.example.tourism.service.trip.impls;

import com.example.tourism.model.Trip;
import com.example.tourism.repository.TripRepository;
import com.example.tourism.service.trip.interfaces.ITripService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class TripServiceImpl implements ITripService {
    final TripRepository repository;

    public TripServiceImpl(TripRepository tripRepository) {
        this.repository = tripRepository;
    }


    @Override
    public Trip getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Trip create(Trip trip) {
        return repository.save(trip);
    }

    @Override
    public Trip update(Trip trip) {
        return repository.save(trip);
    }

    @Override
    public Trip delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Trip> getAll() {
        return repository.findAll();
    }
}

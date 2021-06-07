package com.example.tourism.service.trip.interfaces;

import com.example.tourism.model.Trip;

import java.util.List;

public interface ITripService {
    Trip getById(String id);
    Trip create(Trip trip);
    Trip update(Trip trip);
    Trip delete(String id);
    List<Trip> getAll();
}

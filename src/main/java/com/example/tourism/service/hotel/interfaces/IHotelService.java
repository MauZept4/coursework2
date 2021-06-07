package com.example.tourism.service.hotel.interfaces;

import com.example.tourism.model.Hotel;

import java.util.List;

public interface IHotelService {
    Hotel getById(String id);
    Hotel create(Hotel hotel);
    Hotel update(Hotel hotel);
    Hotel delete(String id);
    List<Hotel> getAll();
}

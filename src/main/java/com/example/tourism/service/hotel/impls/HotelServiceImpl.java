package com.example.tourism.service.hotel.impls;

import com.example.tourism.model.Hotel;
import com.example.tourism.repository.HotelRepository;
import com.example.tourism.service.hotel.interfaces.IHotelService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class HotelServiceImpl implements IHotelService {
    final HotelRepository repository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.repository = hotelRepository;
    }


    @Override
    public Hotel getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Hotel create(Hotel hotel) {
        return repository.save(hotel);
    }

    @Override
    public Hotel update(Hotel hotel) {
        return repository.save(hotel);
    }

    @Override
    public Hotel delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Hotel> getAll() {
        return repository.findAll();
    }
}

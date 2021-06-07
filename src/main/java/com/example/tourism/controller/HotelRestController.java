package com.example.tourism.controller;

import com.example.tourism.model.Hotel;
import com.example.tourism.service.hotel.impls.HotelServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/hotels")
public class HotelRestController {
    final
    HotelServiceImpl service;

    public HotelRestController(HotelServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all hotels")
    @GetMapping("/get/all")
    public List<Hotel> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get hotel by id")
    @GetMapping("/get/{id}")
    public Hotel getById(@PathVariable("id") @Parameter(name = "id", description = "ID of coach to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete hotel by id")
    @DeleteMapping("/delete/{id}")
    public Hotel deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new hotel")
    @PostMapping("/create/")
    public Hotel create(@RequestBody Hotel hotel){
        return service.create(hotel);
    }

    @Operation(summary = "Edit hotel")
    @PutMapping("/update/")
    public Hotel update(@RequestBody Hotel hotel){
        return service.update(hotel);
    }
}

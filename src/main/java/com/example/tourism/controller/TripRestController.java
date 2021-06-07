package com.example.tourism.controller;

import com.example.tourism.model.Trip;
import com.example.tourism.service.trip.impls.TripServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/trips")
public class TripRestController {
    final
    TripServiceImpl service;

    public TripRestController(TripServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all trips")
    @GetMapping("/get/all")
    public List<Trip> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get trip by id")
    @GetMapping("/get/{id}")
    public Trip getById(@PathVariable("id") @Parameter(name = "id", description = "ID of route to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete trip by id")
    @DeleteMapping("/delete/{id}")
    public Trip deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of route to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new trip")
    @PostMapping("/create/")
    public Trip create(@RequestBody Trip trip){
        return service.create(trip);
    }

    @Operation(summary = "Edit trip")
    @PutMapping("/update/")
    public Trip update(@RequestBody Trip trip){
        return service.update(trip);
    }
}

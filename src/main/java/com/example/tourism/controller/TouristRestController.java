package com.example.tourism.controller;

import com.example.tourism.model.Tourist;
import com.example.tourism.service.tourist.impls.TouristServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/tourists")
public class TouristRestController {
    final
    TouristServiceImpl service;

    public TouristRestController(TouristServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all tourists")
    @GetMapping("/get/all")
    public List<Tourist> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get tourist by id")
    @GetMapping("/get/{id}")
    public Tourist getById(@PathVariable("id") @Parameter(name = "id", description = "ID of tourist to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete tourist by id")
    @DeleteMapping("/delete/{id}")
    public Tourist deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of tourist to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new tourist")
    @PostMapping("/create/")
    public Tourist create(@RequestBody Tourist tourist){
        return service.create(tourist);
    }

    @Operation(summary = "Edit tourist")
    @PutMapping("/update/")
    public Tourist update(@RequestBody Tourist tourist){
        return service.update(tourist);
    }
}

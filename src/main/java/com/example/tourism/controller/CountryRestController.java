package com.example.tourism.controller;

import com.example.tourism.model.Country;
import com.example.tourism.service.country.impls.CountryServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/countries")
public class CountryRestController {
    final
    CountryServiceImpl service;

    public CountryRestController(CountryServiceImpl service) {
        this.service = service;
    }


    @Operation(summary = "Get all campaigns")
    @GetMapping("/get/all")
    public List<Country> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get campaign by id")
    @GetMapping("/get/{id}")
    public Country getById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete campaign by id")
    @DeleteMapping("/delete/{id}")
    public Country deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new campaign")
    @PostMapping("/create/")
    public Country create(@RequestBody Country country){
        return service.create(country);
    }

    @Operation(summary = "Edit campaign")
    @PutMapping("/update/")
    public Country update(@RequestBody Country country){
        return service.update(country);
    }
}

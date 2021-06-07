package com.example.tourism.controller;

import com.example.tourism.model.Luggage;
import com.example.tourism.service.luggage.impls.LuggageServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/luggages")
public class LuggageRestController {
    final
    LuggageServiceImpl service;

    public LuggageRestController(LuggageServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all luggages")
    @GetMapping("/get/all")
    public List<Luggage> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get luggage by id")
    @GetMapping("/get/{id}")
    public Luggage getById(@PathVariable("id") @Parameter(name = "id", description = "ID of section to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete luggage by id")
    @DeleteMapping("/delete/{id}")
    public Luggage deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of section to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new luggage")
    @PostMapping("/create/")
    public Luggage create(@RequestBody Luggage luggage){
        return service.create(luggage);
    }

    @Operation(summary = "Edit luggage")
    @PutMapping("/update/")
    public Luggage update(@RequestBody Luggage luggage){
        return service.update(luggage);
    }
}

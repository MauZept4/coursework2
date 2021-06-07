package com.example.tourism.controller;

import com.example.tourism.model.touristDoc;
import com.example.tourism.service.touristdoc.impls.TouristDocServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/touristdocs")
public class TouristDocRestController {
    final
    TouristDocServiceImpl service;

    public TouristDocRestController(TouristDocServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all groups")
    @GetMapping("/get/all")
    public List<touristDoc> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get group by id")
    @GetMapping("/get/{id}")
    public touristDoc getById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete group by id")
    @DeleteMapping("/delete/{id}")
    public touristDoc deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of group to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new group")
    @PostMapping("/create/")
    public touristDoc create(@RequestBody touristDoc group){
        return service.create(group);
    }

    @Operation(summary = "Edit group")
    @PutMapping("/update/")
    public touristDoc update(@RequestBody touristDoc group){
        return service.update(group);
    }
}

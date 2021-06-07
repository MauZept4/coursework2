package com.example.tourism.controller;

import com.example.tourism.model.Activities;
import com.example.tourism.service.activities.impls.ActivitiesServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/activities")
public class ActivitiesRestController {
    final
    ActivitiesServiceImpl service;

    public ActivitiesRestController(ActivitiesServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all activities")
    @GetMapping("/get/all")
    public List<Activities> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get activity by id")
    @GetMapping("/get/{id}")
    public Activities getById(@PathVariable("id") @Parameter(name = "id", description = "ID of activity to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete activity by id")
    @DeleteMapping("/delete/{id}")
    public Activities deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of activity to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new activity")
    @PostMapping("/create/")
    public Activities create(@RequestBody Activities activities){
        return service.create(activities);
    }

    @Operation(summary = "Edit activities")
    @PutMapping("/update/")
    public Activities update(@RequestBody Activities activities){
        return service.update(activities);
    }
}

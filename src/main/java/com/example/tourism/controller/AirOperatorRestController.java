package com.example.tourism.controller;

import com.example.tourism.model.AirOperator;
import com.example.tourism.service.airoperator.impls.AirOperatorServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/AirOperator")
public class AirOperatorRestController {
    final
    AirOperatorServiceImpl service;
    public AirOperatorRestController(AirOperatorServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all air operators")
    @GetMapping("/get/all")
    public List<AirOperator> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get air operator by id")
    @GetMapping("/get/{id}")
    public AirOperator getById(@PathVariable("id") @Parameter(name = "id", description = "ID of air operator to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete air operator by id")
    @DeleteMapping("/delete/{id}")
    public AirOperator deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of activity to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new air operator")
    @PostMapping("/create/")
    public AirOperator create(@RequestBody AirOperator airOperator){
        return service.create(airOperator);
    }

    @Operation(summary = "Edit air operator")
    @PutMapping("/update/")
    public AirOperator update(@RequestBody AirOperator airOperator){
        return service.update(airOperator);
    }
}

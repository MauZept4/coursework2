package com.example.tourism.controller;

import com.example.tourism.model.Department;
import com.example.tourism.service.department.impls.DepartmentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/departments")
public class DepartmentRestController {
    final
    DepartmentServiceImpl service;

    public DepartmentRestController(DepartmentServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all departments")
    @GetMapping("/get/all")
    public List<Department> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get department by id")
    @GetMapping("/get/{id}")
    public Department getById(@PathVariable("id") @Parameter(name = "id", description = "ID of departments to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete department by id")
    @DeleteMapping("/delete/{id}")
    public Department deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of departments to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new department")
    @PostMapping("/create/")
    public Department create(@RequestBody Department department){
        return service.create(department);
    }

    @Operation(summary = "Edit department")
    @PutMapping("/update/")
    public Department update(@RequestBody Department department){
        return service.update(department);
    }
}

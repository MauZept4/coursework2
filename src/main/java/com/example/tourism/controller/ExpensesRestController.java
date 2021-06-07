package com.example.tourism.controller;

import com.example.tourism.model.Expenses;
import com.example.tourism.service.expenses.impls.ExpensesServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/expenses")
public class ExpensesRestController {

    final
    ExpensesServiceImpl service;

    public ExpensesRestController(ExpensesServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all expenses")
    @GetMapping("/get/all")
    public List<Expenses> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get expenses by id")
    @GetMapping("/get/{id}")
    public Expenses getById(@PathVariable("id") @Parameter(name = "id", description = "ID of diary to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete expenses by id")
    @DeleteMapping("/delete/{id}")
    public Expenses deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of diary to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new expenses")
    @PostMapping("/create/")
    public Expenses create(@RequestBody Expenses expenses){
        return service.create(expenses);
    }

    @Operation(summary = "Edit expenses")
    @PutMapping("/update/")
    public Expenses update(@RequestBody Expenses expenses){
        return service.update(expenses);
    }
}

package com.example.tourism.service.expenses.interfaces;

import com.example.tourism.model.Expenses;

import java.util.List;

public interface IExpensesService {
    Expenses getById(String id);
    Expenses create(Expenses expenses);
    Expenses update(Expenses expenses);
    Expenses delete(String id);
    List<Expenses> getAll();
}

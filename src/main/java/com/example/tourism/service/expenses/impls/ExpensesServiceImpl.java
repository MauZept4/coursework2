package com.example.tourism.service.expenses.impls;

import com.example.tourism.model.Expenses;
import com.example.tourism.repository.ExpensesRepository;
import com.example.tourism.service.expenses.interfaces.IExpensesService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ExpensesServiceImpl implements IExpensesService {
    final ExpensesRepository repository;

    public ExpensesServiceImpl(ExpensesRepository expensesRepository) {
        this.repository = expensesRepository;
    }


    @Override
    public Expenses getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Expenses create(Expenses expenses) {
        return repository.save(expenses);
    }

    @Override
    public Expenses update(Expenses expenses) {
        return repository.save(expenses);
    }

    @Override
    public Expenses delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Expenses> getAll() {
        return repository.findAll();
    }
}

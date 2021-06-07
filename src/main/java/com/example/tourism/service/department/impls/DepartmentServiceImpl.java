package com.example.tourism.service.department.impls;

import com.example.tourism.model.Department;
import com.example.tourism.repository.DepartmentRepository;
import com.example.tourism.service.department.interfaces.IDepartmentService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class DepartmentServiceImpl implements IDepartmentService {
    final DepartmentRepository repository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.repository = departmentRepository;
    }


    @Override
    public Department getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Department create(Department department) {
        return repository.save(department);
    }

    @Override
    public Department update(Department department) {
        return repository.save(department);
    }

    @Override
    public Department delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Department> getAll() {
        return repository.findAll();
    }
}

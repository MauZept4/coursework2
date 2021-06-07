package com.example.tourism.service.department.interfaces;

import com.example.tourism.model.Department;

import java.util.List;

public interface IDepartmentService {
    Department getById(String id);
    Department create(Department department);
    Department update(Department department);
    Department delete(String id);
    List<Department> getAll();
}

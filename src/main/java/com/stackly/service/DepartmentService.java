package com.stackly.service;

import java.util.List;

import com.stackly.entity.Department;

public interface DepartmentService {
    Department create(Department dept);
    List<Department> getAll();
    Department getById(Long id);
    Department update(Long id, Department dept);
    void delete(Long id);
}
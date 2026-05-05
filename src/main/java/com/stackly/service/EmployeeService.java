package com.stackly.service;

import java.util.List;

import com.stackly.entity.Employee;

public interface EmployeeService {
    Employee create(Employee emp);
    List<Employee> getAll();
    Employee getById(Long id);
    Employee update(Long id, Employee emp);
    void delete(Long id);
}
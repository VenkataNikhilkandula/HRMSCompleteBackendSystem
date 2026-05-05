package com.stackly.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackly.entity.Employee;
import com.stackly.repository.EmployeeRepository;
import com.stackly.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee create(Employee emp) {
        repo.findByEmail(emp.getEmail())
            .ifPresent(e -> { throw new RuntimeException("Duplicate Email"); });
        return repo.save(emp);
    }

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new RuntimeException("Not Found"));
    }

    @Override
    public Employee update(Long id, Employee emp) {
        Employee existing = getById(id);
        existing.setName(emp.getName());
        existing.setSalary(emp.getSalary());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
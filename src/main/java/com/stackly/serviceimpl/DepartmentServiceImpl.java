package com.stackly.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackly.entity.Department;
import com.stackly.repository.DepartmentRepository;
import com.stackly.service.DepartmentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    @Override
    public Department create(Department dept) {
        return repo.save(dept);
    }

    @Override
    public List<Department> getAll() {
        return repo.findAll();
    }

    @Override
    public Department getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Department Not Found"));
    }

    @Override
    public Department update(Long id, Department dept) {
        Department existing = getById(id);
        existing.setName(dept.getName());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
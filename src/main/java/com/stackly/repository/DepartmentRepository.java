package com.stackly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackly.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
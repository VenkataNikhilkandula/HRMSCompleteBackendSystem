package com.stackly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackly.entity.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {
}
package com.stackly.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackly.entity.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Long> {
    List<Leave> findByEmployeeId(Long empId);
}
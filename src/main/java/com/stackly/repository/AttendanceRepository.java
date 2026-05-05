package com.stackly.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackly.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    List<Attendance> findByEmployeeId(Long empId);
}
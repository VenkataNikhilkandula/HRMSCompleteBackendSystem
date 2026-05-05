package com.stackly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackly.entity.Attendance;
import com.stackly.service.AttendanceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/attendance")
@RequiredArgsConstructor
public class AttendanceController {
    @Autowired
    private AttendanceService service;

    @PostMapping
    public Attendance mark(@RequestBody Attendance attendance) {
        return service.markAttendance(attendance);
    }

    @GetMapping("/employee/{empId}")
    public List<Attendance> getByEmployee(@PathVariable Long empId) {
        return service.getByEmployee(empId);
    }
}
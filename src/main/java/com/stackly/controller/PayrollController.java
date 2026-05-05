package com.stackly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackly.DTO.PayrollRequest;
import com.stackly.entity.Payroll;
import com.stackly.service.PayrollService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/payroll")
@RequiredArgsConstructor
public class PayrollController {
    @Autowired
    private PayrollService service;

    @PostMapping
    public Payroll generate(@RequestBody PayrollRequest request) {
        return service.generatePayroll(request.getEmployee(), request.getPresentDays());
    }

    @GetMapping
    public List<Payroll> getAll() {
        return service.getAll();
    }
}
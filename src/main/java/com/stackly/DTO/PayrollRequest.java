package com.stackly.DTO;

import com.stackly.entity.Employee;

import lombok.Data;

@Data
public class PayrollRequest {
    private Employee employee;
    private int presentDays;
}
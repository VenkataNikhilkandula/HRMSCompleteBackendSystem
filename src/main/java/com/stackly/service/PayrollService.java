package com.stackly.service;

import java.util.List;

import com.stackly.entity.Employee;
import com.stackly.entity.Payroll;

public interface PayrollService {
    Payroll generatePayroll(Employee employee, int presentDays);
    List<Payroll> getAll();
}
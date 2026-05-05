package com.stackly.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackly.entity.Employee;
import com.stackly.entity.Payroll;
import com.stackly.repository.EmployeeRepository;
import com.stackly.repository.PayrollRepository;
import com.stackly.service.PayrollService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PayrollServiceImpl implements PayrollService {
    @Autowired
    private PayrollRepository repo;
    private EmployeeRepository employeeRepo;

    @Override
    public Payroll generatePayroll(Employee employee, int presentDays) {

        // 🔹 Fetch employee from DB using ID
        Long empId = employee.getId();

        Employee emp = employeeRepo.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee Not Found"));

        // 🔹 Safe calculation
        double salary = emp.getSalary() != null ? emp.getSalary() : 0.0;

        double dailySalary = salary / 30;
        double finalSalary = dailySalary * presentDays;

        // 🔹 Create payroll
        Payroll payroll = new Payroll();
        payroll.setEmployee(emp);
        payroll.setCalculatedSalary(finalSalary);

        return repo.save(payroll);
    }

    @Override
    public List<Payroll> getAll() {
        return repo.findAll();
    }
}
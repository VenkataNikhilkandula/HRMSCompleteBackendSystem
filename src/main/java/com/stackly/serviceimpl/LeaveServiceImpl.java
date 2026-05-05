package com.stackly.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackly.entity.Employee;
import com.stackly.entity.Leave;
import com.stackly.repository.EmployeeRepository;
import com.stackly.repository.LeaveRepository;
import com.stackly.service.LeaveService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveRepository repo;
    private EmployeeRepository employeeRepo;

    @Override
    public Leave applyLeave(Leave leave) {

        // 🔹 Fetch employee from DB
        Long empId = leave.getEmployee().getId();

        Employee employee = employeeRepo.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee Not Found"));

        // 🔹 Set full employee object
        leave.setEmployee(employee);

        // 🔹 Set status
        leave.setStatus("PENDING");

        return repo.save(leave);
    }

    @Override
    public Leave approveLeave(Long id) {

        Leave leave = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Leave Not Found"));

        leave.setStatus("APPROVED");

        return repo.save(leave);
    }

    @Override
    public List<Leave> getAll() {
        return repo.findAll();
    }
}
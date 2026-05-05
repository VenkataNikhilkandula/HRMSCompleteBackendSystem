package com.stackly.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackly.entity.Attendance;
import com.stackly.entity.Employee;
import com.stackly.repository.AttendanceRepository;
import com.stackly.repository.EmployeeRepository;
import com.stackly.service.AttendanceService;

import lombok.RequiredArgsConstructor;

	@Service
	@RequiredArgsConstructor
	public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private AttendanceRepository repo;
    private EmployeeRepository employeeRepo;

    @Override
    public Attendance markAttendance(Attendance attendance) {

        Long empId = attendance.getEmployee().getId();

        Employee employee = employeeRepo.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        attendance.setEmployee(employee);

        return repo.save(attendance);
    }

	@Override
	public List<Attendance> getByEmployee(Long empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
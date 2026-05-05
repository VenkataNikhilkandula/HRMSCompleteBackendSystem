package com.stackly.service;

import java.util.List;

import com.stackly.entity.Attendance;

public interface AttendanceService {
    Attendance markAttendance(Attendance attendance);
    List<Attendance> getByEmployee(Long empId);
}
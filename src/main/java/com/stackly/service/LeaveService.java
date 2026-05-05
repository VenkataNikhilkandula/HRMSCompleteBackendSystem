package com.stackly.service;

import java.util.List;

import com.stackly.entity.Leave;

public interface LeaveService {
    Leave applyLeave(Leave leave);
    Leave approveLeave(Long id);
    List<Leave> getAll();
}
package com.stackly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackly.entity.Leave;
import com.stackly.service.LeaveService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/leaves")
@RequiredArgsConstructor
public class LeaveController {
    @Autowired
    private LeaveService service;

    @PostMapping
    public Leave apply(@RequestBody Leave leave) {
        return service.applyLeave(leave);
    }

    @PutMapping("/approve/{id}")
    public Leave approve(@PathVariable Long id) {
        return service.approveLeave(id);
    }

    @GetMapping
    public List<Leave> getAll() {
        return service.getAll();
    }
}
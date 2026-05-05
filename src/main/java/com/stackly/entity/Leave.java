package com.stackly.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "leaves") 
@Data
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status; 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id") 
    private Employee employee;
}
package com.example.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcrud.controller.SavithraEmployeeController;
import com.example.studentcrud.model.Employee;

public interface SavithraEmployeeRepository extends JpaRepository<Employee, Long> {
    void save(SavithraEmployeeController emp);
}
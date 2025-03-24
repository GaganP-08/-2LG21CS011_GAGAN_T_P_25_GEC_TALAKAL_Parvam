package com.example.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcrud.controller.StaffController;
import com.example.studentcrud.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    void save(StaffController stf);
}
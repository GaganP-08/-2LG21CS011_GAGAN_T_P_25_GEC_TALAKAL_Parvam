package com.example.JoyToyFactroy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JoyToyFactroy.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

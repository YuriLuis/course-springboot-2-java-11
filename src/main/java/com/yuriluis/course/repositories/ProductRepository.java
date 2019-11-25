package com.yuriluis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuriluis.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

package com.yuriluis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuriluis.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

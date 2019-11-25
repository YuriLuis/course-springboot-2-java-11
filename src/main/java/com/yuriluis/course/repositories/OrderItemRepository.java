package com.yuriluis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuriluis.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

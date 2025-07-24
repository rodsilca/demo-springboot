package com.rodsproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodsproject.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

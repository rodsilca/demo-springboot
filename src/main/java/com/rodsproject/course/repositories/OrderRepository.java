package com.rodsproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodsproject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

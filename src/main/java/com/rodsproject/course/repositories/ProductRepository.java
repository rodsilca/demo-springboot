package com.rodsproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodsproject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

package com.rodsproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodsproject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

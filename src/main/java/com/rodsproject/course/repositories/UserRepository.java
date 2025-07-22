package com.rodsproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodsproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

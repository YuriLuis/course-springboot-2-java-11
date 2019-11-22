package com.yuriluis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuriluis.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

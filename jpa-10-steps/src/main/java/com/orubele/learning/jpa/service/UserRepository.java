package com.orubele.learning.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orubele.learning.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

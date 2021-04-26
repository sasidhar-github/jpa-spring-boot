package com.practice.jpa.jpaspringboot.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.jpa.jpaspringboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

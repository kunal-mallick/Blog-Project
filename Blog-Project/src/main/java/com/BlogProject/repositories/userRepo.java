package com.BlogProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BlogProject.entities.user;


public interface userRepo extends JpaRepository<user, Integer> {

}

package com.graymatter.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);
	
	
}

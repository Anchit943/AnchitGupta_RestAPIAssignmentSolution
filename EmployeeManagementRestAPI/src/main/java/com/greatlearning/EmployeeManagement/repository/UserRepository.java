package com.greatlearning.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagement.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User getUserByUsername(String username);
	
}

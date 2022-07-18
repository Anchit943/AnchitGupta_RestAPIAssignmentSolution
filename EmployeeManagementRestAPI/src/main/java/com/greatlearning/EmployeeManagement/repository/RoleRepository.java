package com.greatlearning.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagement.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	public Role findRoleByName(String name);
	
}

package com.greatlearning.EmployeeManagement.service;

import java.util.List;

import com.greatlearning.EmployeeManagement.entities.Role;
import com.greatlearning.EmployeeManagement.entities.User;

public interface CredentialsService {

	Role addNewRole(String name);

	User addNewUser(String username, String password, String role_name);
	
	List<Role> listAllRoles();
}

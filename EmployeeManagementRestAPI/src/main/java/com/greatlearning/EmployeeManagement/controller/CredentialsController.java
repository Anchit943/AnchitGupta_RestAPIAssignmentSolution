package com.greatlearning.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.EmployeeManagement.entities.Role;
import com.greatlearning.EmployeeManagement.entities.User;
import com.greatlearning.EmployeeManagement.service.CredentialsService;

@RestController
@RequestMapping("/sign-up")
public class CredentialsController {
	
	@Autowired
	private CredentialsService credService;
	
	@PostMapping("/newRole")
	public Role addRole(String name) {
		return credService.addNewRole(name);
	}
	
	@PostMapping("/newUser")
	public User addUser(String username, String password, String role_name) {
		return credService.addNewUser(username, password, role_name);
	}
	
	@GetMapping("/listRoles")
	public List<Role> listRoles() {
		return credService.listAllRoles();
	}
	
}

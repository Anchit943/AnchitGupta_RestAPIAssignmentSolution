package com.greatlearning.EmployeeManagement;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.greatlearning.EmployeeManagement.entities.Role;
import com.greatlearning.EmployeeManagement.entities.User;
import com.greatlearning.EmployeeManagement.repository.UserRepository;

@SpringBootApplication
public class EmployeeManagementRestApiApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementRestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setId(1);
		user.setUsername("admin1");
		user.setPassword(new BCryptPasswordEncoder().encode("123"));
		List<Role> roles = new ArrayList<>();
		roles.add(new Role(1,"ADMIN"));
		user.setListOfRoles(roles);
		userRepository.save(user);
	}
}

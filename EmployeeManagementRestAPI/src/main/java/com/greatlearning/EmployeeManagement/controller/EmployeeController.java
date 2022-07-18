package com.greatlearning.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.EmployeeManagement.entities.Employee;
import com.greatlearning.EmployeeManagement.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("")
	public String home() {
		return "Welcome to Employee Management Portal";
	}
	
	@GetMapping("/list")
	public List<Employee> list() {
		return employeeService.findAll();
	}
	
	@PostMapping("/add")
	public Employee add(Employee employee) {
		employeeService.save(employee);
		return employeeService.findById(employee.getId());
	}
	
	@DeleteMapping("/delete")
	public String delete(int id) {
		employeeService.deleteById(id);
		return String.format("Deleted employee with id: %d", id);
	}
	
	@GetMapping("/get")
	public Employee getById(int id) {
		return employeeService.findById(id);
	}
	
	@PostMapping("/update")
	public Employee update(Employee employee) {
		employeeService.save(employee);
		return employeeService.findById(employee.getId());
	}
	
	@GetMapping("/search")
	public List<Employee> search(String firstname) {
		return employeeService.search(firstname);
	}
	
	@GetMapping("/sortlist")
	public List<Employee> getSortedList(Direction direction) {
		return employeeService.findAllCustomSorted(direction);
	}
	
}


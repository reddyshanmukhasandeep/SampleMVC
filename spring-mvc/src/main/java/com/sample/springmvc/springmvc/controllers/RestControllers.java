package com.sample.springmvc.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springmvc.springmvc.model.Address;
import com.sample.springmvc.springmvc.model.Employee;
import com.sample.springmvc.springmvc.repo.AddresRepo;
import com.sample.springmvc.springmvc.repo.EmployeeRepo;

@RestController
public class RestControllers {
	@Autowired
	EmployeeRepo empRepo;
	@Autowired
	AddresRepo addRepo;
	
	@GetMapping("/emp")
	public ResponseEntity<List<Employee>> firstPage() {
		List<Employee> emp= new ArrayList<>();
				emp = empRepo.findAll();
				
		return new ResponseEntity<List<Employee>>(emp,HttpStatus.OK);
	}
	
@PostMapping("/emp")

	public ResponseEntity<Employee>  SecondPage(@RequestBody Employee empl) {
	
	 Employee emp = empRepo.save(empl);
	 
return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
@GetMapping("/add")
public ResponseEntity<List<Address>> AddPage() {
	List<Address> emp= new ArrayList<>();
			emp = addRepo.findAll();
	return new ResponseEntity<List<Address>>(emp,HttpStatus.OK);
}

@PostMapping("/add")

public ResponseEntity<Address>  SecondPage(@RequestBody Address address) {

	Address add = addRepo.save(address);

return new ResponseEntity<Address>(add,HttpStatus.OK);
}
}

package com.sample.springmvc.springmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.springmvc.springmvc.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}

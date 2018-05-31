package com.sample.springmvc.springmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.springmvc.springmvc.model.Address;




@Repository
public interface AddresRepo extends JpaRepository<Address, Long> {

}

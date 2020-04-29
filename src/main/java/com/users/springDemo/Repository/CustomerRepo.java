package com.users.springDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.springDemo.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>
{
	
}
package com.users.springDemo.Resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.springDemo.Model.Customer;
import com.users.springDemo.Model.SpringDemoModelClass;
import com.users.springDemo.Repository.CustomerRepo;
import com.users.springDemo.Repository.UserRepo;

@RestController
@RequestMapping("customer/info")
public class CustomerController 
{
	CustomerRepo CustRepo;
	
	@GetMapping("/find")
	public List<Customer> getAll()
	{
		return CustRepo.findAll();
	}
}



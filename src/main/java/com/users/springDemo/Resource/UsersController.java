package com.users.springDemo.Resource;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.springDemo.Model.SpringDemoModelClass;
import com.users.springDemo.Repository.UserRepo;

@RestController
@RequestMapping("rest/demo")
public class UsersController 
{
	UserRepo usersRepo;
	
	@GetMapping("/find")
	public List<SpringDemoModelClass> getAll()
	{
		return usersRepo.findAll();
	}
}

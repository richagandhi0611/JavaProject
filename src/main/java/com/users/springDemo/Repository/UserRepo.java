package com.users.springDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.users.springDemo.Model.SpringDemoModelClass;


@Repository
public interface UserRepo extends JpaRepository<SpringDemoModelClass, Long>
{
	
}

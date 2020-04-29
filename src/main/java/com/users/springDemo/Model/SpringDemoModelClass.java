package com.users.springDemo.Model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class SpringDemoModelClass 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	public int Id;
	
	@Column(name = "name")
	public String name;
	
}

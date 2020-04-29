package com.users.springDemo.Model;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Customer Id")
	private int CustID;
	
	@Column(name = "Customer name")
	private String custName;
	
	public int getCustId()
	{
		return this.CustID;
	}
	
	public void setCustID(int custId)
	{
		this.CustID = custId;
		
	}
}

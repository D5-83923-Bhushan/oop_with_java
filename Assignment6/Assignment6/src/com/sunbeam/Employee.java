package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
	int id;
	String firstname;
	String lastname;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public void accept(Scanner sc) 
	{
		System.out.println("Enter the emp id");
		id=sc.nextInt();
		
		
		System.out.println("Enter the first name");
		firstname=sc.next();
		
		System.out.println("Enter the last name");
		lastname=sc.next();
		
		
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}	
	
	public abstract void earning();
	
	
	
}

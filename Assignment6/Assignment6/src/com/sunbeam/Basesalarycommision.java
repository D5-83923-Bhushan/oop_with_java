package com.sunbeam;

import java.util.Scanner;

public class Basesalarycommision extends commisioemployee{
  
	 int base_salary;

	public Basesalarycommision() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Basesalarycommision(int base_salary) {
		super();
		this.base_salary = base_salary;
	}
	 
	public void accept(Scanner sc) 
	{
		super.accept(sc);
		System.out.println("Enter the base_salary");
	    base_salary=sc.nextInt();
	}
	public void earning() {
		
	     return super.earning() + (base_salary * 1.10);
		
	}

}

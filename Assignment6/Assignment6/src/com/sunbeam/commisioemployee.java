package com.sunbeam;

import java.util.Scanner;

public class commisioemployee extends Employee {
	
	int grosssales;
	int commisionRate;
	public commisioemployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Scanner sc) 
	{
		super.accept(sc);
		System.out.println("Enter the gross sales");
		grosssales=sc.nextInt();
		
		System.out.println("Enter the commision Rate");
		commisionRate=sc.nextInt();
		
	}

	@Override
	public String toString() {
		return "commisioemployee [grosssales=" + grosssales + ", commisionRate=" + commisionRate + ", id=" + id
				+ ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	@Override
	public void earning() {
		// TODO Auto-generated method stub
		System.out.println(grosssales*commisionRate);
		
	}

	public String commisionRate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

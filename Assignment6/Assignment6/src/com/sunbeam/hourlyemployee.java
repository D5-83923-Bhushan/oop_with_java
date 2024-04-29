package com.sunbeam;

import java.util.Scanner;

public class hourlyemployee extends Employee {
            
	int wages;
	int hrs;
	public hourlyemployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Scanner sc) 
	{
           super.accept(sc);
           System.out.println("Enter the wages");
           wages=sc.nextInt();
           
           System.out.println("Enter the hrs");
           hrs=sc.nextInt();
           
           
	}
	@Override
	public String toString() {
		return "hourlyemployee [wages=" + wages + ", hrs=" + hrs + ", id=" + id + ", firstname=" + firstname
				+ ", lastname=" + lastname + "]";
	}
	
	public void earning() 
	{
		if(hrs<40) 
		{
			System.out.println(wages*hrs);
		
		}
		else 
		{
		   System.out.println(wages * 40 + (hrs - 40) * wages * 1.5);	
		}
		
		
	}
	
	
	  
	
}

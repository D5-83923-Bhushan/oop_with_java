package com.sunbeam;

import java.util.Scanner;

public class Employesalary extends Employee{
     int weeklysalary;

     public Employesalary() 
     {
     
     }
     
     
     public void accept(Scanner sc) 
     {
    	 super.accept(sc);
    	 System.out.println("Enter the weeklysalary");
    	 weeklysalary=sc.nextInt();
    	 
     }



	@Override
	public String toString() {
		return "Employesalary [weeklysalary=" + weeklysalary + ", id=" + id + ", firstname=" + firstname + ", lastname="
				+ lastname + "]";
	}


	@Override
	public void earning() {
		System.out.println(weeklysalary);
		
	}

    
	
}

package com.sunbeam;

import java.util.Scanner;

public class program {


	public static int menu(Scanner sc) {
		System.out.println("press 1 salary of Salaried Employee ");
		System.out.println("press 2 salary of Hourly Employee");
		System.out.println("press 3 salary of Commission Based Employee");
		System.out.println("press 4 salary of Basic with Cpmmission Employee");
		System.out.println("press 5 to exit ");
		System.out.print("Enter the choice - ");
		
		return sc.nextInt();
	}
	

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		Employee[] arr; // Reference
		arr = new Employee[5]; // Array of References
		arr[0] = new   Employesalary();
		arr[1] = new  hourlyemployee();
		arr[2] = new  commisioemployee();
		arr[3] = new Basesalarycommision();
		

		int choice;
		
		while ((choice = menu(sc)) != 5) {
			switch (choice) {
			case 1:
				Employee e1 = new Employesalary();
				 e1.accept(sc);
				 arr[0] = e1;
				 System.out.println(e1);
				break;

			case 2:
				 Employee e2 = new hourlyemployee();
				 hourlyemployee p = (hourlyemployee)e2;
				 p.accept(sc);
				 arr[1] = e2;
				 System.out.println(p);
				break;
				
			case 3:
				Employee e3 = new commisioemployee();
				 commisioemployee p1=(commisioemployee)e3;
				 p1.accept(sc);
				 arr[2] = e3;
				 System.out.println(p1);
				break;
				
			case 4:
				commisioemployee e4 = new Basesalarycommision();
				// BaseSalariedCommissionEmp p2=( BaseSalariedCommissionEmp)e4;
				 e4.accept(sc);
				 System.out.println(e4);
				 arr[3] = e4;
				System.out.println("total salary is = "+ e4.commisionRate()); 
				break;

			default:
				System.out.println("Wrong choice..");
				break;
			}
		}
		
		sc.close();
		for (int i = 0; i < arr.length; i++) {
		    System.out.println(arr[i]);
		    System.out.println("------------------");
		}

	}

}

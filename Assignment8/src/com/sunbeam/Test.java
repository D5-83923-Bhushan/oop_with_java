package com.sunbeam;

import java.util.Scanner;

public class Test {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 
			try {

				System.out.println("Enter the name");
			    String name=sc.next();
			    int str1=name.length();
			    System.out.println("String length is :"+name.length());
			    
			    if(str1>80) {
			   throw new ExceptionLineTooLong();
			    }
			} catch (ExceptionLineTooLong e) {
				
				System.out.println("The strings is too long");
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}



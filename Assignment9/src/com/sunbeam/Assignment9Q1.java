package com.sunbeam;
import java.util.Scanner;

public class Assignment9Q1 
{

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name");
			String s1=sc.next();
			String n1 = "";
			
         	StringBuilder stk=new StringBuilder(s1);
			
			for(int i=0;i<s1.length();i++) 
			{
			    char s=s1.charAt(i);
			    
			    n1=s+n1;
			}
			System.out.println("Reverse String ");
		     System.out.print(n1);
		 	
		}
	}


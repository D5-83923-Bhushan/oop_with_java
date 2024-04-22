import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x double number");
		float x=sc.nextFloat();
		
		System.out.println("Enter the x double number");
		float y=sc.nextFloat();
		
		if(x==y) 
		{
			float res=x+y/2;
			System.out.println("Average of two double number is "+res);
		}
		else 
		{
			System.out.println("error datatype");
		}
		 
	
	}

}

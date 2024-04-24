package com.sunbeam;

import java.util.Scanner;

public class Invoice {
	
	String Part_number;
	String  Part_description;
	int QuantityItem;
	double Price_item;
	
	public Invoice() {
		Part_number="NA";
        Part_description="NA";
        QuantityItem=0;
        Price_item=0;
	}
	
	public Invoice(String part_number, String part_description, int quantityItem, double price_item) {
		this.Part_number = part_number;
		this.Part_description = part_description;
		this.QuantityItem = quantityItem;
		this.Price_item = price_item;
	}

	public String getPart_number() {
		return Part_number;
	}

	public void setPart_number(String part_number) {
		Part_number = part_number;
	}

	public String getPart_description() {
		return Part_description;
	}

	public void setPart_description(String part_description) {
		Part_description = part_description;
	}

	public int getQuantityItem() {
		return QuantityItem;
	}

	public void setQuantityItem(int quantityItem) {
		QuantityItem = quantityItem;
	}

	public double getPrice_item() {
		return Price_item;
	}

	public void setPrice_item(double price_item) {
		Price_item = price_item;
	}
	
	void accept() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the part number");
		Part_number=sc.nextLine();
		System.out.println("Enter the part description ");
	    Part_description=sc.nextLine();
		System.out.println("Enter the Quantity item");
		QuantityItem=sc.nextInt();
		System.out.println("Enter the price per item ");
		Price_item=sc.nextDouble();
		
		
	}
	void display() 
	{
		System.out.println("part number is :"+this.Part_number);
		System.out.println("part descrpition is :"+this.Part_description);
		
		

       if(this.QuantityItem<0) 
       {
    	   int res1=0;
    	   System.out.println("Quantity item is"+res1);
    	   
       }
       else 
       {
    	   System.out.println("Quantity item is :"+this.QuantityItem);
   		
       }
        if(this.Price_item<0)
       {
    	   int res2=0;
    	   System.out.println("price per item :"+res2);
       }
        else {
    		System.out.println("price per item :"+this.Price_item);

        }
      
       System.out.println("---------------------------");
       
	}
	
	void displayInvoice() 
	{
		double res=this.QuantityItem*this.Price_item;
		System.out.println("Total Invoice is "+res);
	}
	 
	
}
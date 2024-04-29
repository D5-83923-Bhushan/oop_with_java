package com.sunbeam;

import java.util.Scanner;

public class cricketer extends player implements Batter,Bowler {

	int  runs;
	int wickets;
	
	
	public cricketer(int runs, int wickets) {
		super();
		this.runs = runs;
		this.wickets = wickets;
	}
     public void accept(Scanner sc) 
     {
    	 System.out.println("Enter the runs");
    	  runs=sc.nextInt();
    	  
    	  System.out.println("Enter the wickets");
    	  wickets=sc.nextInt();
    	  
    	    
     }
     
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	@Override
	public String toString() {
		return "cricketer [runs=" + runs + ", wickets=" + wickets + "]";
	}
	@Override
	public int getWickets() {
		// TODO Auto-generated method stub
		return wickets;
	}

	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return runs;
	}

	
	
}

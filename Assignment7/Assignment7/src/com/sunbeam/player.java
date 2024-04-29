package com.sunbeam;

import java.util.Scanner;

public  abstract class player implements Batter,Bowler {
	int id;
    String name;
    int age;
    int matchesPlayed;
	public player() {
		
		// TODO Auto-generated constructor stub
	}
	public player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
    
    
    
void accept(Scanner sc) 
{
	System.out.println("Enter the id");
	id=sc.nextInt();

	System.out.println("Enter the name");
	name=sc.next();

	System.out.println("Enter the age");
	age=sc.nextInt();
	

	System.out.println("Enter the matchesplayed");
	matchesPlayed=sc.nextInt();
	
	
}
@Override
public String toString() {
	return "player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
}

public boolean equals(Object obj)
  {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    player other = (player) obj;
    return id == other.id;
  }
 
 
}

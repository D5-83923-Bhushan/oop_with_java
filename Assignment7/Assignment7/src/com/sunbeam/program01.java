package com.sunbeam;

import java.util.Scanner;

public class program01 {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        cricketer[] team = new cricketer[11];

        
        for (int i = 0; i < 11; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Matches Played: ");
            int matchesPlayed = scanner.nextInt();

        
            cricketer cricketer = new cricketer(id, age);
            cricketer.accept(scanner);
            team[i] = cricketer;
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Total runs of all players");
            System.out.println("2. Total wickets taken by all players");
            System.out.println("3. Total matches played by all players");
            System.out.println("4. Display all cricketers with matches played");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int totalRuns = 0;
                    for (cricketer cricketer : team) {
                        totalRuns += cricketer.getRuns();
                    }
                    System.out.println("Total runs of all players: " + totalRuns);
                    break;
                case 2:
                    int totalWickets = 0;
                    for (cricketer cricketer : team) {
                        totalWickets += cricketer.getWickets();
                    }
                    System.out.println("Total wickets taken by all players: " + totalWickets);
                    break;
                case 3:
                    int totalMatches = 0;
                    for (cricketer cricketer : team) {
                        totalMatches += cricketer.getMatchesPlayed();
                    }
                    System.out.println("Total matches played by all players: " + totalMatches);
                    break;
                case 4:
                    System.out.println("Details of all cricketers:");
                    for (cricketer cricketer : team) {
                        System.out.println(""+cricketer);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

    }
}
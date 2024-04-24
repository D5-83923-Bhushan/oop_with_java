package com.app.geometry;

import java.util.Scanner;

public class program {


		    public static void main(String[] args) {
		        boolean flag;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the Value of Point P1 X1: ");
		        int x1 = sc.nextInt();
		        System.out.println("Enter the Value of Point P2 Y1: ");
		        int y1 = sc.nextInt();
		        System.out.println("Enter the Value of Point P2 X2: ");
		        int x2 = sc.nextInt();
		        System.out.println("Enter the Value of Point P2 X2: ");
		        int y2 = sc.nextInt();

		        Point2D p1 = new Point2D(x1, y1);
		        Point2D p2 = new Point2D(x2, y2);

		        System.out.println("The Coordinates Of X is " + p1.getDetails());
		        System.out.println("The Co-ordinates Of Y is : " + p2.getDetails());

		        flag = p1.isEqual(p2);

		        if (flag) {
		            System.out.println("Both are Co-ordinates of x and y are Same");
		        } else {
		            System.out.println("Both the Co-ordinates of x and y are not same");
		        }
		        int X1 = p1.getX();
		        int Y1 = p1.getY();
		        int X2 = p2.getX();
		        int Y2 = p2.getY();


		        double xCor = Math.pow((X2 - X1), 2);
		        double yCor = Math.pow((Y2 - Y1), 2);

		        double d = Math.sqrt(xCor + yCor);

		        System.out.println("Distance between two points is ");
		        System.out.println(d);


		    }
		}
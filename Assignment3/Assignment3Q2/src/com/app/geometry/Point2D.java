package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	Integer x = new Integer(0);
	Integer y = new Integer(0);

	public Point2D(){
		x = 0;
		y = 0;
	}

	Point2D(int x,int y){
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public String getDetails(){
		String p1Str = String.valueOf(x);
		String p2Str = String.valueOf(y);
		String returnString = "The Value Of Co-Ordinates of the X  " + p1Str +" Value of Y is " + p2Str ;
		return returnString;

	}

	public boolean isEqual(Object o){
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Point2D that = (Point2D) o;
		return x.equals(that.x) &&
				y.equals(that.y);

	}


}

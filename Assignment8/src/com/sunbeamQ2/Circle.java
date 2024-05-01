package com.sunbeamQ2;

class Circle {
	  private Point2D center;
	  private double diameter;

	  public Circle() {
	    this.center = new Point2D(0, 0);
	    this.diameter = 100;
	  }

	  public void setDiameter(double diameter) throws InvalidDiameterException {
	    if (diameter < 0) {
	      throw new InvalidDiameterException("Diameter cannot be negative");
	    }
	    this.diameter = diameter;
	  }

	  public double getDiameter() {
	    return diameter;
	  }

	  // You can add other methods like getRadius(), getArea(), etc. based on your needs.
	}

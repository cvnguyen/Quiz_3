


import java.lang.Math;

public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double s;
	
		
	//no arg constructor that creates default triangle
	public Triangle(){
		}
	
	//constructor creates a triangle with specified side1, side2, side3
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// accessors
	public double getSide1(){
		return this.side1;
	}

	public double getSide2(){
		return this.side2;
	}
	
	public double getSide3(){
		return this.side3;
	}
	
	// methods getArea, getPerimeter, toString
	public double getArea(){
		s =((side1 + side2 + side3) / (2));
		return (Math.sqrt(s * ((s-side1)*(s-side2)*(s-side3))));
	}
	
	public double getPerimeter(){
		return(side1 + side2 + side3);
	}
	
	public String toString(){
		double area = this.getArea();
		double perimeter = this.getPerimeter();
		return ("The area of the triangle is " + String.valueOf(area) + "\nThe perimeter of the triangle is " + String.valueOf(perimeter));
	}
	

	
}

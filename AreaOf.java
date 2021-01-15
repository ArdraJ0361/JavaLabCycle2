import java.io.*;
import java.util.Scanner;
public class AreaOf
{
	public static void main(String args[])
	{
		System.out.println("Radius of the circle:");
		Scanner scan=new Scanner(System.in);
		double n=scan.nextDouble();
		AreaOf object=new AreaOf();
		object.calcArea(n);
		System.out.println("Length and Breadth of the rectangle:");
		double length=scan.nextDouble();
		double breadth=scan.nextDouble();
		AreaOf object1=new AreaOf();
		object1.calcArea(length,breadth);
	}
	void calcArea(double rad)
	{
		double Area=3.14*rad*rad;
		System.out.println("Area of the Circle : "+Area);
	}
	void calcArea(double l,double b)
	{
		double Area=l*b;
		System.out.println("Area of the rectangle : "+Area);
	}
}
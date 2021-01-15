import java.io.*;
import java.util.Scanner;
public class Area
{
	double length,breadth,area;
	public static void main(String args[])
	{
		System.out.println("Enter the length and breadth of the rectangle : ");
		Scanner scan=new Scanner(System.in);
		double length=scan.nextDouble();
		double breadth=scan.nextDouble();
		Area object=new Area(length,breadth);
		System.out.println("Area of the rectangle : "+object.returnArea());
	}
	public Area(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
		area=length*breadth;
	}
	double returnArea()
	{
		return area;
	}
}
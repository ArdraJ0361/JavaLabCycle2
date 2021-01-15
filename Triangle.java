import java.io.*;
public class Triangle
{
	public static void main(String args[])
	{
		Triangle object=new Triangle();
	}
	public Triangle()
	{
		int a,b,c,perimeter,area;
		a=3;
		b=4;
		c=5;
		perimeter=a+b+c;
		area=(a*b)/2;  
		System.out.println("Perimeter of the triangle with the given sides 3,4,5 units : "+perimeter);
		System.out.println("Area of the triangle with the given sides 3,4,5 units :"+area);
	}
}
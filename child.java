import java.io.*;
public class child extends parent
{
	void method1()
	{
		System.out.println("This is child class");
	}
	public static void main(String args[])
	{
		parent object=new parent();
		object.method();
		child object1=new child();
		object1.method1();
		object1.method();
	}

}
class parent
{
	void method()
	{
		System.out.println("This is parent class ");
	}
}
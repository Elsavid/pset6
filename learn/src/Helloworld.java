import java.util.*;
public class Helloworld{
	public static void main(String args[]) {
		/*
		 * double area; final double pi = 3.1415; String area2; Scanner input1 = new
		 * Scanner(System.in); area = input1.nextDouble(); area2 = input1.next();
		 * System.out.print("the area is:"+area*pi+'\r');
		 * System.out.println("the area is:"+area2);
		 */
		//Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle b1 = new Car();
		System.out.println(v2.getClass());
		//v1.Showinfo();
		v2.Showinfo(b1);
		//b1.Showinfo();
		
	}
}

class Car extends Vehicle{
	public int a;
	public Car() {a = 10;}
	/*
	 * public void Showinfo(Vehicle v1) { System.out.println("car");
	 * System.out.println(v1.a); }
	 */
}
class Vehicle{
	//
	public Vehicle()
	{
		//a = 10;
	}
	public void Showinfo(Vehicle v1)
	{
		Car v2 = (Car)v1;
		System.out.println("vehicle");
		System.out.println(v2.a);
	}
}
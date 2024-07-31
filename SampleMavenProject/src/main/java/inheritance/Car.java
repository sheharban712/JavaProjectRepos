package inheritance;

public class Car extends Vehicle 
{ 
	String plateNumber="KL23";
	static String chasisno="ER233";
	public void print()
	{
		System.out.println("I am a car.My name is "+name);
		System.out.println(chasisno);
	}
	public static void main(String args[])
	{
		Car cr=new Car();
		cr.display();
		cr.print();
		System.out.println("My car no is"+cr.plateNumber);
		System.out.println("My car name is"+cr.name);
		

	}

}

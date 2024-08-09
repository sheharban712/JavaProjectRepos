package interfacepackage;

public class Dog implements Animal{
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
	
	public static void main (String args[])
	{
		Animal an=new Dog();
		an.bark();
	}

}

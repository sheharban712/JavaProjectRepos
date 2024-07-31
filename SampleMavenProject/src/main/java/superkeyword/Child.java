package superkeyword;

public class Child extends Parent{
	String color="black";
	public Child()
	{
		super();
		System.out.println("Child Constructor");
	}
	public void display()
	{
		//super.display();
		//super.print();
		System.out.println("Child class "+color);
		System.out.println("Parent class "+super.color);
	}
	public static void main(String[] args) {
		Child cd=new Child();
		cd.display();
		

	}

}

package interfacepackage;

public class TestClass implements Test1,Test2 {
	public void display()
	{
		System.out.println("Test Interface1");
	}
	public void print()
	{
		System.out.println("Test Interface2");
	}
	
	public static void main(String args[])
	{
		TestClass tc=new TestClass();
		tc.display();
		tc.print();
	}

}


package accessmodifier1;

public class Sample {
	protected int a=10;
	protected void display()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		Sample sm=new Sample();
		sm.display();
	
	}

}

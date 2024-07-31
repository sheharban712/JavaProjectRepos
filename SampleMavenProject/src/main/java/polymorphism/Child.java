package polymorphism;

public class Child extends Parent{
	public void sum(int c,int d)
	{
		int s=c+d;
		System.out.println("Child sum "+s);
		super.sum(30,40);
		
	}
	public static void main(String args[])
	{
		Child cd=new Child();
		cd.sum(20,30);
		
	}
	
	

}

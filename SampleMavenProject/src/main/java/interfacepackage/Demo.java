package interfacepackage;

public class Demo implements Sample {
	
	public int sum()
	{
		
		return A+B;
	}
	
	
	
	public static void main(String args[])
	{
		Sample s=new Demo();
		System.out.println("Sum of "+A+" and "+B+" is " +s.sum());
	}

}

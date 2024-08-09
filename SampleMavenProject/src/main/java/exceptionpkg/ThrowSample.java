package exceptionpkg;

public class ThrowSample {
	
	
	public static void findSum(int a,int b)
	{
		int s=a+b;
		if(s>10)
		{
			throw new ArithmeticException("Sum is greater than 10");
		}
		else
		{
			System.out.println("Sum is less tha 10");
		}
		
	
	}
	
	public static void main(String args[])
	{
		
		
		try
		{
			ThrowSample.findSum(20, 30);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		
	}

}

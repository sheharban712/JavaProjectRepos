package exceptionpkg;

public class DivisionException {
	
public static void  main(String args[])
{
		int arr[]=new int[6];
		try
		{
			System.out.println("Started..");
			//int a=10/0;
			arr[7]=45;
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Division by zero not possible..");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array size is 6	");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("");
		}
		
		System.out.println("Finished..");
}

}

package exceptionpkg;

public class DrivingClass {
	
	public static void check(int age) throws LicenseException
	{
		if(age<18) {
		throw new LicenseException("Age should be greater than 18");
		}
		else
		{
			System.out.println("Eligible for License");
		}
	}

	public static void main(String[] args) {
		try
		{
			DrivingClass.check(11);
		}
		catch(LicenseException ex)
		{
			System.out.println(ex);
		}
	}

}

package exceptionpkg;

public class ThrowsExpUnchecked {
	
	public static void check() throws ArithmeticException
	{
		throw new ArithmeticException();
	}
	public static void main(String args[]) {
		
		ThrowsExpUnchecked.check();
	}

}

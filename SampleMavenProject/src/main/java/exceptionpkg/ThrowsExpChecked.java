package exceptionpkg;

import java.io.IOException;

public class ThrowsExpChecked {
	
	public static void check() throws IOException
	{
		throw new IOException();
		
	}
	
	public static void main(String args[]) throws IOException
	{
		ThrowsExpChecked.check();
	}

}

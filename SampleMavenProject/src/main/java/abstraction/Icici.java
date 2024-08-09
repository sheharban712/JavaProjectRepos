package abstraction;

public class Icici extends Bank{
	public void interest()
	{
		System.out.println("ICIC Bank Interest is 23%");
	}
	
	public static void main(String args[])
	{
		Icici ic=new Icici();
		ic.interest();
		
		Hdfc hd=new Hdfc();
		hd.interest();
		
		Federal fd=new Federal();
		fd.interest();
		
	}

}

package polymorphism;

public class OffSeason{
	int payment;
	double total;
	public void getDiscount(int amt)
	{
		System.out.println("Off Season Discount is 15%");
		total=amt*1.5;
		System.out.println("Discount amount is "+total);
		
		
		
	}

}

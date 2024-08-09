package polymorphism;

public class OnSeason extends OffSeason{
	
	public void getDiscount(int amt)
	{
		System.out.println("Discount is 40%");
		
		System.out.println("On Season Discount is 40%");
		double discount=payment*0.4;
		total=payment-discount;
		System.out.println("Discount amount is "+total);
		
	}
	public static void main(String agrs[])
	{
		String season="ON";
		
		OffSeason offs;
		
		switch(season)
		{
		case "ON": 	offs=new OnSeason();
					offs.payment=1000;
					offs.getDiscount(offs.payment);
					break;
					
		case "OFF" :offs=new OffSeason();
					offs.payment=1000;
					offs.getDiscount(offs.payment);
					break;
		default    :System.out.println("No discount"); 
		}
		
	}

}

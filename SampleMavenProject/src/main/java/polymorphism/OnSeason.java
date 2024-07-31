package polymorphism;

public class OnSeason extends Customer{
	
	public void getDiscount()
	{
		System.out.println("Discount is 40%");
		
	}
	public static void main(String agrs[])
	{
		Customer cs=new Customer();
		cs.season="OFF";
		
		switch(cs.season)
		{
		case "ON": 	cs=new OnSeason();
					cs.getDiscount();
					break;
					
		case "OFF" :cs=new OffSeason();
					cs.getDiscount();
					break;
		default    :System.out.println("No discount"); 
		}
		
	}

}

package superkeyword;

public class AdditionSub extends Addition{
	
	 public AdditionSub(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	public void checkDivisionByZero()
	 {
		super.result=super.findSum();
		
		if((result%10)==0)
		{
			System.out.println("Divisible by 10");
		}
		else
		{
			System.out.println("Not Divisible by 10");
		}
			
	 }

	public static void main(String[] args) {
		
		AdditionSub ads=new AdditionSub(15,20);
		ads.checkDivisionByZero();

	}

}

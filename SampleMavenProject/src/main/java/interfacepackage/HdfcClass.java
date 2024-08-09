package interfacepackage;

public class HdfcClass implements RbiInterface{
	public double recurringDeposit(int amount,int duration)
	{
		double interest=(amount*duration*rate)/100;
		double total=(amount+interest)*duration;
		return total;
	}
	public static void main(String args[])
	{
		RbiInterface s=new HdfcClass();
		int amt=1000,period=2;
		System.out.println("Total amount of recurring deposit of "+amt+" "
				+ "after a period of "+period+" "
				+ "years is " +s.recurringDeposit(amt,period));
	}

}

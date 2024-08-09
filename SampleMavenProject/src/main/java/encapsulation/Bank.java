package encapsulation;

public class Bank {
	
	
	
	public static void main(String args[])
	{
		User usr=new User();
		usr.setPin(1001);
		int pinId=usr.getPin();
		
		usr.validatePin(pinId);
		
	
	}

}

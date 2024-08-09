package encapsulation;

public class User {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public void validatePin(int pin) 
	{
		if(pin==1001 ||pin==1234 || pin==1212)
		{
			System.out.println("Valid pin");
		}
		else
		{
			System.out.println("Invalid pin");
		}
		
	}

}

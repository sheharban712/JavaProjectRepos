package finalpackage;

public final class FinalUser {
	final int a=30;
	
	//a=20;//cannot change the value of final variable
	final int b ;//blank final variable/uninitialized final variable
	public FinalUser()
	{
		b=40;
	}
	
	public final void display()
	{
		System.out.println("Final Class");
	}

}

package abstraction;

public class MotorCycle extends Vehicle{
	
	public void startEngine()
	{
		System.out.println("Motor Cylce starts");
		
	}
	public void stopEngine()
	{
		System.out.println("Motor Cycle stops");
	}
	
	public static void main(String agrs[])
	{
		Car cc=new Car();
		cc.startEngine();
		cc.stopEngine();
		
		MotorCycle mc=new MotorCycle();
		mc.startEngine();
		mc.stopEngine();
		
	
	}

}

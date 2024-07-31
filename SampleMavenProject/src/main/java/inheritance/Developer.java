package inheritance;

public class Developer  extends Employee{

	public void displayD()
	{
	  System.out.println("I am a Developer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer dp=new Developer();
		dp.designation="Developer";
		dp.display();
		
		Tester ts=new Tester();
		ts.designation="Tester";
		ts.display();
		ts.displayT();
		dp.displayD();
		
	}

}

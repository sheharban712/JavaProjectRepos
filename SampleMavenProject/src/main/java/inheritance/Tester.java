package inheritance;

public class Tester extends Employee {
	public void displayT()
	{
	  System.out.println("I am a Tester");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester ts=new Tester();
		ts.designation="Tester";
		ts.display();
		ts.displayT();
	}

}

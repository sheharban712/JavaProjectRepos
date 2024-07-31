package polymorphism;

public class Cricket extends Game{
	
	public void play()
	{
		System.out.println("Play Cricket");
	}
	
	public static void main(String args[])
	{
		Game g=new Cricket();
		g.play();
		g=new Cricket();
		g.play();
		g=new Hockey();
		g.play();
	}

}

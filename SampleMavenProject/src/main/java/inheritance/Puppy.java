package inheritance;

public class Puppy extends Dog {
	
	public void print()
	{
		System.out.println("Baby Of a dog");
	}

	public static void main(String[] args) {
		Puppy pp=new Puppy();
		pp.print();
		pp.bark();
		pp.feature();

	}

}

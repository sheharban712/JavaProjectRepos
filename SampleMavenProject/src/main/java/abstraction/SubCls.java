package abstraction;

public class SubCls extends MainCls {
	public void display()
	{
	 System.out.println("Sub Class Abstract Method");
	}
	
	public void print()
	{
		System.out.println("Sub class Method");
	}
	
	public static void main(String args[])
	{
	   SubCls sb=new SubCls();
	   sb.display();
	   sb.print();
	   sb.show();
	}
	
	

}

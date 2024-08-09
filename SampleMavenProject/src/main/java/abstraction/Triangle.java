package abstraction;

public class Triangle extends Shape{
	float base,ht,a,c;
	public double calculateArea()
	{
		area=(base*ht)/2;
		return area;
		
	}
	public double calculatePerimeter()
	{
		perimeter=a+base+c;
		return perimeter;
		
	}
	
	public static void main(String args[])
	{
		Circle cc=new Circle();
		cc.radi=3;
		System.out.println("Area of a circle with radius "+cc.radi+" is "
		+cc.calculateArea());
		System.out.println("Perimeter of a circle with radius "+cc.radi+" is "+cc.calculatePerimeter());
	
		Triangle tg=new Triangle();
		tg.base=10f;
		tg.ht=10f;
		tg.c=10f;
		tg.a=10f;
		System.out.println("Area of a triangle is "
				+tg.calculateArea());
		System.out.println("Perimeter of a triangle "+tg.calculatePerimeter());
			
		
				
	}

}

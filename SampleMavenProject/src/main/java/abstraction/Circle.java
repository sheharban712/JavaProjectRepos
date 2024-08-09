package abstraction;

public class Circle extends Shape{
	float radi;
	public double calculateArea()
	{
		area=3.14*radi*radi;
		return area;
	}
	public double calculatePerimeter()
	{
		perimeter=2*3.14*radi;
		return perimeter;
	}

}

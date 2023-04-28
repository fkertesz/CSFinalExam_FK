
public class Circle implements Shape
{
	private double radius;
	
	public Circle()
	{
		radius = 1;
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double area()
	{
		return radius*radius*Math.PI;
	}
}

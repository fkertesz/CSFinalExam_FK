
public class Square implements Shape
{
	private double side;
	
	public Square()
	{
		side = 1;
	}
	
	public Square(double side)
	{
		this.side = side;
	}
	
	public double area()
	{
		return side*side;
	}
}

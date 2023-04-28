
public class ApplicationShape
{
	public static void main(String[] args)
	{
		Square s = new Square(3);
		Circle c = new Circle(4);
		
		System.out.println("the area of the square is " + s.area());
		System.out.println("the area of the circle is " + c.area());
	}
}

import java.util.*;

public class Calculator
{	
	public Calculator()
	{

	}

	public String add(double n, double m)
	{
		try
		{
			return n + "+" + m + "=" + (n+m);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not numbers");
			return "undefined";
		}
	}

	public String subtract(double n, double m)
	{
		try
		{
			return n + "-" + m + "=" + (n-m);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not numbers");
			return "undefined";
		}
	}

	public String multiply(double n, double m)
	{
		try
		{
			return n + "*" + m + "=" + (n*m);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not numbers");
			return "undefined";
		}
	}

	public String divide(double n, double m)
	{
		try
		{
			DivideByZeroException z =
					new DivideByZeroException();
			if(m==0)
				throw z;
			return n + "/" + m + "=" + (n/m);
		}
		catch(DivideByZeroException e)
		{
			System.out.println("Can't divide by zero.");
			return "undefined";
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not numbers");
			return "undefined";
		}
	}

}

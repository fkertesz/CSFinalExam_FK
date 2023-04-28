
public class ApplicationCalculator 
{
	public static void main(String[] args) throws DivideByZeroException
	{
	Calculator calc = new Calculator();
	
	System.out.println(calc.add(1,2));
	System.out.println(calc.divide(1, 0));
	}
}

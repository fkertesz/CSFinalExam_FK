
public class ApplicationDog
{
	public static void main(String[] args)
	{
		Dog aDog = new Dog();
		aDog.setName("Rufus");
		aDog.setBarkType("RUFF RUFF!");
		
		aDog.bark();
		aDog.bark("My name is Rufus, bark.");
		aDog.walk();
	}
}

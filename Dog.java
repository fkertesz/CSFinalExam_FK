public class Dog extends Pet
{
	private String barkType;
	private String furType;
	
	public Dog()
	{
		super();
		barkType = "no bark type";
		furType = "no fur type";
	}
	
	public Dog(String name, int age, String color, String barkType, String furType)
	{
		super(name, age, color);
		this.barkType = barkType;
		this.furType = furType;
	}
	
	public void walk()
	{
		System.out.println("Your dog, " + name + ", is walking.");
	}
	
	public void bark()
	{
		System.out.println(name + ": " + barkType);
	}
	
	public void bark(String barks)
	{
		System.out.println(name + ": " + barks);
	}

	public String getBarkType() {
		return barkType;
	}

	public void setBarkType(String barkType) {
		this.barkType = barkType;
	}

	public String getFurType() {
		return furType;
	}

	public void setFurType(String furType) {
		this.furType = furType;
	}
	
}

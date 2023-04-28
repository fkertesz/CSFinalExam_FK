public abstract class Pet
{
	protected String name;
	protected int age;
	protected String color;
	
	public Pet()
	{
		name = "no name";
		age = 0;
		color = "no color";
	}
	
	public Pet(String name, int age, String color)
	{
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public void walk()
	{
		System.out.println("Your pet, " + name + ", is walking.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

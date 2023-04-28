
public class ApplicationList
{
	public static void main(String[] args)
	{
		String [] stringArray = {"word", "another"};
		List<String> stringList = new List<String>(stringArray);
		System.out.println(stringList.toString());
		
		Integer [] intArray = {1,2,3};
		List<Integer> intList = new List<Integer>(intArray);
		System.out.println(intList.toString());
		
	}
}


public class List<T>
{
	private T[] aList;
	
	public List(T[] aList)
	{
		this.aList = aList;
	}
	
	public T getEntry(int index)
	{
		return aList[index];
	}
	
	public void setEntry(int index, T entry)
	{
		aList[index] = entry;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < aList.length; i++)
		{
			sb.append(aList[i].toString());
			if(i != (aList.length -1))
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
}

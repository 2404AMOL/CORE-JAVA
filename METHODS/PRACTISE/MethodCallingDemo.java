class MethodCallingDemo
{
	public static void fruit(String name)
	{
		String res = name;
		String var = res +" juice";
		System.out.println(var);
	}
	public static void main(String args[])
	{
		fruit("Apple");
		String res = fruit("Apple");//CTE
		System.out.println(fruit("Apple"));//CTE
	}

}

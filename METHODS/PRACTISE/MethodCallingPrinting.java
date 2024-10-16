class MethodCallingPrinting
{
	public static String fruit(String name)
	{
		String res=name;
		String var=res +" juice";
		return var;
	}
	public static void main(String args[])
	{
		System.out.println(fruit("Apple"));
	}

}

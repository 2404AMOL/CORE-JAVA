class MethodCallingVar 
{
	public static String fruit(String name)
	{
		String res=name;
		String var=res +" juice";
		return var;
	}
	public static void main(String args[])
	{
		String res=fruit("Apple");
		System.out.println(res);
		System.out.println(res);
		System.out.println(res);
	}

}

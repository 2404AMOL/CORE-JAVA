class MethodCalling 
{
	public static String fruit(String name)
	{
		String res = name;
		String var = res+" Juice ";
		return var;
	}
	public static void main (String args[])
	{
		//(1st)Not Using the Return Value
		fruit("Apple");
		//(2nd) Store the return value & use the variable
		String res = fruit("Apple");
		System.out.println(res);
		//(3r)Printing the Return value Directly From Printing Statement
		System.out.println(fruit("Apple"));
	}

}

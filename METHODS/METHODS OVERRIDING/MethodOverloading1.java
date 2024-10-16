class MethodOverloading1 
{
	public static void test (double a)
	{
		System.out.println("test(double)");
	}
	public static void test (int a)
	{
		System.out.println("test(int)");
	}
	public static void main(String args[])
	{
		test ('a');
	}

}

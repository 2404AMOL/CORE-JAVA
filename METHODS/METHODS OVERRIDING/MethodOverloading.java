class MethodOverloading 
{
	public static void test ()
	{
		System.out.println("test-()");
	}
	public static void test (int a)
	{
		System.out.println("test(int)");
	}
	public static void main(String args[])
	{
		test(10);
	}
}

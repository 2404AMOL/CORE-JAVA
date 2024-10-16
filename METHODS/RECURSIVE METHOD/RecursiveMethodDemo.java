class RecursiveMethodDemo 
{
	public static void test()
	{
		System.out.println("test()");
		test();

	}
	public static void main(String[] args) 
	{
			test();
	}
}

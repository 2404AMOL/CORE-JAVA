class Program3 
{
	static int a=10;
	int b=20;

	public static void demo()
	{
		System.out.println("Static-Method");
	}
	public void test()
	{
		System.out.println("Non-Static-Method");
	}

	static
	{
		System.out.println("Static-Block");
	}

	{
		System.out.println("Non-Static-Block");
	}
	
	public static void main(String[] args) 
	{
		Program3 oP = new Program3();
		System.out.println(oP.a);
		oP.test();
		oP.demo();
	}
}

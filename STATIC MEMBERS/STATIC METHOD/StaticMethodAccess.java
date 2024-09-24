class StaticMethodAccess
{
	static public void demo()
	{
		System.out.println("Demo()");
	}
	static
	{
		demo();//1.Directly By Its Name
		StaticMethodAccess.demo();//2.Class Name As Reference
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

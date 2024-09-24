class StaticBlockMethodCalling 
{
	static public void demo()
	{
		System.out.println("Demo()");
	}
	static
	{
		demo();
		StaticBlockMethodCalling.demo();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

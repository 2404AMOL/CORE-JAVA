class MethodReturnType 
{
	public static void display()
	{
		System.out.println("Hello World");
	}
	public static String test()
	{
		return "Hello";
	}
	public static void main(String[] args) 
	{
		//System.out.println(display());// error: 'void' type not allowed here
		System.out.println(test());//
	}
}
/* We can Only Write methods in Printing Statment that have ReturnType.*/
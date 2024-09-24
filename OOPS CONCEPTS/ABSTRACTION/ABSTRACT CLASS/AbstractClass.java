abstract class Demo 
{
	static int a=10;
	int b=20;

	public static void staticMethod()
	{
		System.out.println("Static()-Method");
	}

	public void nonStatic()
	{
		System.out.println("Non-Static()-Method");
	}

	abstract public void test();

	static
	{
		System.out.println("Static Block");
		
		int a=30;
		System.out.println(a);
		System.out.println(Demo.a);
		Demo.staticMethod();

	}

	{
		this.test();
		System.out.println("Non-Static Block");
	}
	Demo()
	{
		System.out.println("Constructor Block");
	}

	
}

class AbstractClass extends Demo
{

	public void test()
	{
		System.out.println("Abstract Method()");
	}
	public static void main(String[] args) 
	{
		AbstractClass obj = new AbstractClass();
	}
	
}
abstract class AbstaractClass 
{
	static int a=10;
	int b=20;

	public static void staticMethod()
	{
		System.out.println("Static()-Method");
		int a=30;
		System.out.println(a);
		System.out.println(AbstaractClass.a);
	}

	public void nonStatic()
	{
		System.out.println("Non-Static()-Method");
	}

	abstract public void test();

	static
	{
		System.out.println("Static Block");
		
	}

//We can use the Non-Static block for execution for that you have create the Object
//For the Child Class and Child Class Should be Concrete Class.
	{
		System.out.println("Non-Static Block");
		System.out.println();
	}
	AbstaractClass()
	{
		System.out.println("Constructor Block");
	}

	
}

class ChildDemo extends AbstaractClass
{

	public void test()
	{
		System.out.println("Abstract Method()");
	}
	public static void main(String[] args) 
	{		

		ChildDemo oC = new ChildDemo();
		oC.staticMethod();
	}
	
}
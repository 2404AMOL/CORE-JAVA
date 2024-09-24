class A 
{
	int a=10;
	static public void display()
	{
		System.out.println("Class-A()");
	}
}

class B extends A
{
	int a=20;
	static public void display()
	{
		System.out.println("Class-B()");
	}
	static public void test()
	{
		System.out.println("test() Method of Class B");
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		B oB = new B();

		A oA = oB;//Upcasting
		oA.display();
		System.out.println(oA.a);
		System.out.println(oA);
		B oB1 =(B) oA;//Downcasting
		oB1.test();
	}
}

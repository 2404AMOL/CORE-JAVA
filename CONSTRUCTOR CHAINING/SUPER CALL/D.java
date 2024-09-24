class A
{
	static int a=10;
	A()
	{
		System.out.println("A() Constructor");
	}
	public static void test()
	{
		System.out.println("test() Method Of Class A");
	}
}
class B extends A
{
	static int a=20;
	B()
	{
		System.out.println("B() Constructor");
	}
	public static void demo()
	{
		System.out.println("demo() Method of Class B");
	}
}
class C extends B
{
	static int a=30;
	C()
	{
		System.out.println("C() Constructor");
	}
		public static void display()
	{
		System.out.println("display() Method of Class C");
	}
}
class D extends C
{
	static int a=40;
	D()
	{
		System.out.println("D() Constructor");
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(A.a);

	}
	public static void main(String[] args) 
	{
		D obj = new D();
	}
}
/* In Every Class Constructor there first by default statemet is present called super();
==>Super() is the first statement of constructor.
==>Calling One class to another class Constructor is called as Constructor Invocation;
==>Constructor invocation is done from Child Class to Parent Class.
==>Constructor Execution is Done from Parent class to Child class.
*/
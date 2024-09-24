abstract class A 
{
	abstract void demo();
}

class B extends A
{
	void demo()
	{
		System.out.println("Test()-Two");
	}
}

class C extends A
{
	void demo()
	{
		System.out.println("Demo()-Three");
	}
}

class DriverDemo
{
	public static void main(String[] args) 
	{
		//Creating Object for Child Class
		C oC=new C();
		
		A oA=oC;
		oA.demo();

		B oB=new B();
		A oA1=oB;
		oA1.demo();


	}
}

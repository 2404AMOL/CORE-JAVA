interface Interface
{
	int a=10;// You Cannot Change the Value In the Interface.
	 abstract void demo();

	default void display()//Default Is keyword In Java
	{
		System.out.println("This is Display Method");
	}
	public static void test()
	{
		System.out.println("This is Test() Static Method");
	}
}
class InterfaceMain implements Interface
{
	public void demo()
	{
		System.out.println("This is Demo Method");
		
	}
	public static void main(String[] args) 
	{
		InterfaceMain oI = new InterfaceMain();
		oI.demo();
		oI.display();
//For Child Class Object Reference variable you can Access The Interfaces Implemented Method
		System.out.println(oI.a);
		Interface.test();
		//oI.test();//CTE :- You cannot access the static method of Interface using child class object.
	//	System.out.println(oI.a=20); //CTE :- You Cannot Change Value
	}
}


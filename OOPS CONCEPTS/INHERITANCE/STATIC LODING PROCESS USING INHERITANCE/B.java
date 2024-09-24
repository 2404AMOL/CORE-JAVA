class A
{
	static int a;

	static 
	{
		System.out.println("static Block A ");
	}
	static void demo()
	{
		System.out.println("Demo() Method Of Class A");
	}
}
class B extends A
{
	
	static int a=10;

	static 
	{
		System.out.println("static Block B ");
	}
	static void test()
	{
		System.out.println("test() Method Of Class B");
	}
	
	public static void main(String[] args)
	{
			
		System.out.println(a);//10  local--childclass--parentclass
		System.out.println(A.a);//0

		test();//test()
		demo();// own class ---> parent class -- sDemo()

	}

}
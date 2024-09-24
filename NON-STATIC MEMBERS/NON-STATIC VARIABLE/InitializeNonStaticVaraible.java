class InitializeNonStaticVaraible 
{
	int a;
	public static void main(String[] args) 
	{
		InitializeNonStaticVaraible obj = new InitializeNonStaticVaraible();
		System.out.println(obj.a);
		obj.a=11;
		System.out.println(obj.a);

		InitializeNonStaticVaraible obj1 = new InitializeNonStaticVaraible();
		System.out.println(obj1.a);
		obj1.a=13;
		System.out.println(obj1.a);
	}
}

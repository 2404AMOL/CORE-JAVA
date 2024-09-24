class Program3 
{
	Program3()
	{
	this(123);
	System.out.println("this()");
	}
	Program3(int a)
	{
		super();
		System.out.println("super()");
	}
	public static void main(String[] args) 
	{
		Program3 obj = new Program3();
	}
}

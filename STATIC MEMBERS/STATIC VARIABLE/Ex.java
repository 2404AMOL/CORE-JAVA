//QNO1:-Can We Access The The Static Varible From One Class To Another Class
class Ex 
{
	static int a=10;
	static
	{
		System.out.println("Static Block OF Class Ex");
		int b;
		b=20;
		int c=15;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Of Class Ex");
	}
}

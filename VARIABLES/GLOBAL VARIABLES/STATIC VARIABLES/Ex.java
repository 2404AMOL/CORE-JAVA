//QNO2=Can We Access The The Static Varible From One Class To Another Class
class Ex 
{
	static int b;
	static{
		System.out.println("From Static Block OF Class Ex");
		b=20;
		int c=015;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println("From Main Of Class Ex");
	}
}

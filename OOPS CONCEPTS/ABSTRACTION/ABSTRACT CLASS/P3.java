abstract class P1 
{
	abstract public void test();
}

class P2 extends P1
{
	public void test()
	{
		System.out.println("Test-()");
	}
}
class P3
{
	public static void main(String[] args) 
	{
		P2 oP2 = new P2();
		oP2.test();
	}
}

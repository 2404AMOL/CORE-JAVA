class Demo 
{
	static int a=10;
	int b=20;

	public static int getData()
	{
		System.out.println("This is Program 20");
		return 1;
	}
}
class SuperKeyDemo extends Demo
{
	int a=30;
	public static void main(String[] args) 
	{
		SuperKeyDemo oSD = new SuperKeyDemo();
		oSD.display();
	}
	public void display()
	{
		System.out.println(super.a=50);
		System.out.println(super.b);
		System.out.println(super.getData());
	}
}


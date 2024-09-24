class Program1 
{
	static int a=10;
	int b=20;

	public void display()
	{
		int a=30;
		System.out.println("This is Program1 Class");
	}
}
class Program2 extends Program1
{
	static int a=40;
	int b=50;
	public void display()
	{
		int a=60;
		System.out.println("This is Program2 Class");
		System.out.println(super.a);
		System.out.println(super.b);
		super.display();
		this.run();
	}
	public void run()
	{
		System.out.println("Program2 is running");
	}
}
class Main 
{
	static int a=70;
	int b=80;

	public void display()
	{
		int a=90;
		System.out.println(this.a);//10
	}
	public static void main(String[] args) 
	{
		//Main oM=new Main();
		//oM.display();

		Program2 oP2=new Program2();
		oP2.display();
	}
}

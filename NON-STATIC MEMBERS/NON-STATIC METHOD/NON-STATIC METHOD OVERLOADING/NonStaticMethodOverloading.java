//QNO1:-Perform Method Overloading Using Non-Static Method
class NonStaticMethodOverloading 
{
	int a=15;
	int b=15;

	void display()
	{
		int res = a+b;
		System.out.println(res);

	}
	void display(int a,int b)
	{
		int res = a*b;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		NonStaticMethodOverloading oNMO = new NonStaticMethodOverloading();
		oNMO.display();
		oNMO.display(2,2);
		System.out.println("Hello World!");
	}
}

interface A
{
	static int a=20;
	static void demo()
	{
		System.out.println("This Is Static Method");
	}

}

interface B
{
	abstract void display();
}
class MyClass implements A,B
{
	public static void main(String[] args) 
	{
		MyClass oM = new MyClass();
		A.demo();//Using Interface Name you can Access the Static Method
		oM.display();
		System.out.println(A.a);
	}
	public void display()
	{
		System.out.println("This is override Method");
	}
}

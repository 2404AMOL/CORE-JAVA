interface A
{
	//Using Default keyword we can provide the body(Implementation) to the methods.
	default void display()
	{
		System.out.println("A Says Hello");
	}
}
class MyClass implements A
{
	public static void main(String[] args) 
	{
		MyClass oM = new MyClass();
		oM.display();
	}
}

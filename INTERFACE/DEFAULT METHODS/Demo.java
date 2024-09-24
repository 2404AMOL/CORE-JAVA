interface One
{
	default void display()
	{
		System.out.println("One Says Hello");
	}
}
interface Two
{
	default void display(int a)
	{
		System.out.println("Two Says Hello");
		System.out.println(a);
	}
}
class Demo implements One,Two 
{
	public static void main(String[] args) 
	{
		Demo oD = new Demo();
		oD.display();
		oD.display(15);
	}
}

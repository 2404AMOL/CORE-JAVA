interface Amol
{
	default void display()
	{
		System.out.println("One Says Hello");
	}
}
interface Ganesh
{
	default void display(int a)
	{
		System.out.println("Two Says Hello");
		System.out.println(a);
	}
}
class Driver implements Amol,Ganesh 
{
	public static void main(String[] args) 
	{
		Driver oD = new Driver();
		oD.display();
	}
	
	public void display()
	{
		System.out.println("This Is Overide Method");
	}

}

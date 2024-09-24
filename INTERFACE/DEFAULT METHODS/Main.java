interface P1
{
	default void display()
	{
		System.out.println("P1 Says Hello");
	}
}
interface P2
{
	default void demo()
	{
		System.out.println("P2 Says Hello");
		//System.out.println(a);
	}
}
class Main implements P1,P2 
{
	public static void main(String[] args) 
	{
		Main oM = new Main();
		oM.display();
	}
}

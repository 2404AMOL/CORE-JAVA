class Animal 
{
	static String name="Charlie";

	public void display()
	{
		String name="Charlie";
		System.out.println("Name:"+name);
	}
}

class Dog extends Animal
{
	public static void main(String demo[])
	{
		Dog oD=new Dog();
		oD.display();
	}
}

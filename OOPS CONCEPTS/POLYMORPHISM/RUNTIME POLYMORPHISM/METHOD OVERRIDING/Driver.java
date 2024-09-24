class Program1 
{
	static public void display()
	{
		System.out.println("Class-A()");
	}
}

class Program2 extends Program1
{
	static public void display()
	{
		System.out.println("Class-B()");
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		Program2 oP2=new Program2();

		Program1 oP1 = oP2;//Upcasting
		oP1.display();
	}
}

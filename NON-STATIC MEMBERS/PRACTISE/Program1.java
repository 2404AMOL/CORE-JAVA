class Program1 
{
	int a=10;
	
	public void display()
	{
		Program1 obj = new Program1();
		System.out.println(obj.a);
		System.out.println("Non-Static Method");
	}

	{
		System.out.println("Non-Static Block");
	}
	public static void main(String[] args) 
	{
		
		Program1 oP = new Program1();
		oP.display();
		
	}
}

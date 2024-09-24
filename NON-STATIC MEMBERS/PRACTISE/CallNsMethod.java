class CallNsMethod 
{
	int a=10;
	
	public void getData()
	{
		System.out.println(a);
		this.a=101;
		System.out.println(this.a);
	}
	public void display()
	{
		this.getData();
		this.a=200;//using this Keyword
		getData();//Directly By Its Name
	}

	public static void main(String[] args) 
	{
		CallNsMethod ob = new CallNsMethod();
		ob.display();
		System.out.println("Hello World!");
	}
}

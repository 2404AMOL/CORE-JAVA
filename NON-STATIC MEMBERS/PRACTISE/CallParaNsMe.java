class CallParaNsMe 
{
	String Name;
	String aName;
	double dPrice;

	public void print(String name,String aName,double dPrice)
	{
		Name=name;
		aName=aName;
		dPrice=dPrice;

		System.out.println("Book Name:-"+Name);
		System.out.println("Author Name:-"+aName);
		System.out.println("Book Price:-"+dPrice);

	}

	{
		print("Agnipank","Apj",355.55);
		this.print("ABC","KaranSharma",555.78);
	}

	public static void main(String[] args) 
	{
		CallParaNsMe oB1=new CallParaNsMe();
	}
}

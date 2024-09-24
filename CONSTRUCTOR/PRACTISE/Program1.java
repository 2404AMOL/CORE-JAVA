class Program1 
{

	String strName;
	String strAuName;
	double dPrice;

	Program1()
	{

		System.out.println("Deafult Constructor");
	}

	Program1(String name,String autName,double dprice)
	{
		this.strName=name;
		this.strAuName=autName;
		this.dPrice=dprice;

		System.out.println(strName+" " +strAuName);
	}

	public static void main(String[] args) 
	{

		Program1 Obj = new Program1();
		Program1 obj1 = new Program1("Agnipank","APJ",355.55);
		System.out.println("Hello World!");
	}
}

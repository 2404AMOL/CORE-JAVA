class Vehicle 
{
	String strName;

	Vehicle()
	{
		strName="";
	}

	Vehicle(String name)
	{
		strName=name;
	}

	public void getData()
	{
		System.out.println("The Vehicle Name Is:-"+strName);
	}
}

class TwoWheeler extends Vehicle
{
	String strBrandName;
	double dPrice;
	String strColor;
	
	TwoWheeler()
	{
		
	String strBrandName="";
	double dPrice=0.0;
	String strColor="";
	}

	TwoWheeler(String n,String VN,double p,String c)
	{
		super(VN);
	strBrandName=n;
	dPrice=p;
	strColor=c;
	}
	public void display()
	{
		System.out.println("The Brand Name IS:-"+strBrandName);
		System.out.println("The Brand Name IS:-"+dPrice);
		System.out.println("The Brand Name IS:-"+strColor);
	}
	public static void main(String... args)
	{
		TwoWheeler oTW=new TwoWheeler("HeroHonda","Splendor",75000,"Black");
		oTW.getData();
		oTW.display();
	}
}


class FourWheeler extends Vehicle
{
	String strBrandName;
	double dPrice;
	String strColor;
	
	FourWheeler()
	{
		
	String strBrandName="";
	double dPrice=0.0;
	String strColor="";
	}

	FourWheeler(String n,String VN,double p,String c)
	{
		super(VN);
	strBrandName=n;
	dPrice=p;
	strColor=c;
	}
	public void display()
	{
		System.out.println("The Brand Name IS:-"+strBrandName);
		System.out.println("The Brand Name IS:-"+dPrice);
		System.out.println("The Brand Name IS:-"+strColor);
	}
	public static void main(String... args)
	{
		FourWheeler oFW = new FourWheeler("TATA","SUV",575000,"Black");
		oFW.getData();
		oFW.display();
	}
}



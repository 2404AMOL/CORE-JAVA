class Vehicle  
{
	public void run()
	{
		System.out.println("Vehicle Is Running");
	}
}

class Bike extends Vehicle
{
	public void run()
	{
		System.out.println("Bike Is Running Safely");
	}
}
class MainDemo
{
	public static void main(String[] args) 
	{
		Bike oB=new Bike();

		Vehicle oV = oB;//Upcasting

		oV.run();
	}
}
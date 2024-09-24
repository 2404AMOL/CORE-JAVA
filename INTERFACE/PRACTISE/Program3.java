//Hierarchical Inheritance
interface Vehicles 
{
	//abstract methods
	void changeGear(int a);
	void speedUp(int a);
	void applyBreakes(int a);
}
class Bicycle implements Vehicles
{
	int speed;
	int gear;

	public void changeGear(int newGear)
	{
		gear=newGear;
	}

	public void speedUp(int increment)
	{
		speed=speed+increment;
	}

	public void applyBreakes(int decrement)
	{
		speed=speed-decrement;
	}
	public void printStates()
	{
		System.out.println("Speed : "+speed+ "gear : "+gear);
	}
}
class Bike implements Vehicles
{
	int speed;
	int gear;

	public void changeGear(int newGear)
	{
		gear=newGear;
	}

	public void speedUp(int increment)
	{
		speed=speed+increment;
	}
	public void applyBreakes(int decrement)
	{
		speed=speed-decrement;
	}
	public void printStates()
	{
		System.out.println("Speed : "+speed+ "gear : "+gear);
	}
}

class Program3
{
	public static void main(String[] args) 
	{
		//Creating Instance For Class Bicycle
		Bicycle oBic=new Bicycle();
		oBic.changeGear(2);
		oBic.speedUp(3);
		oBic.applyBreakes(1);
		System.out.println("Bicycle Present State :");
		oBic.printStates();

		//Creating Instance For Class Bike
		Bike oBik=new Bike();
		oBik.changeGear(2);
		oBik.speedUp(4);
		oBik.applyBreakes(3);
		System.out.println("Bike Present State :");
		oBic.printStates();
	}
}

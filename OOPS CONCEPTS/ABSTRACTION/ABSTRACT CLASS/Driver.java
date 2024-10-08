abstract class One 
{
	abstract void test();
}

abstract class Two extends One
{
	abstract void demo();
	void test()
	{
		System.out.println("Test()-Two");
	}
}

class Three extends Two
{
	void demo()
	{
		System.out.println("Demo()-Three");
	}
	void test()
	{
		super.test();
		System.out.println("Test()-Three");
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		//Creating Object for Child Class
		Three oTh=new Three();
		oTh.demo();

		//upcasting From Class Three To Class Two
		Two oTw=oTh;
		oTw.demo();


		//upcasting From Class Two To Class One
		One oN=oTw;
		oN.test();//Accessing The Overriding Method Class Two
		//Accessing The Overriding Method Class Three
	}
}

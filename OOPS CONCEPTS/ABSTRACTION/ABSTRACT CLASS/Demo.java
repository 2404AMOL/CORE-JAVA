abstract class Program1 
{
	abstract void demo();//abstract Method

	//Concrete Method
	public void test()//NS Method
	{//Method Implementation
		System.out.println("NS-METHOD-TEST()");
	}
	
	public static void key()//Static Method
	{//Method Implementation
		System.out.println("Static -Method-Key()");
	}

}
class Program2 extends Program1
{
	void demo()
	{
		System.out.println("Demo()-Method");
	}
	
}

class Demo
{
	public static void main(String[] args) 
	{
	//	Program1 oP1 = new Program1();//We cannot create the Object for the Abstract Class
		Program1 oP1 = new Program2();

		System.out.println(oP1);

		oP1.demo();
		oP1.key();

		//Downcasting
		Program2 oP2 = (Program2)oP1;
		oP2.demo();
		oP2.test();
		
	}
}
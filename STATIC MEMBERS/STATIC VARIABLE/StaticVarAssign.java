//QNO3:-Can We Assign The Value To The Static varible Into Main Method If The Local Varible Is Present

//Answer:-No We Can't Assign The Value To The Static Varible If The local Varible Is Present Becuse
//1:-In Firstly Seacrhes For Local Variable Before Its Line If It IS Not Present
//2:-Then It Serches For The Static Varible

//On Such Case If You Try To Initialize Value To The Static Varible
//The You HAve To Take Help OF Class Name AS Refernce
class StaticVarAssign
{
	static int a;

	public static void main(String[] args) 
	{
		a=100;
		System.out.println(a);

		a=50;
		System.out.println(a);
		System.out.println(a);

		a=200;
		System.out.println(a);

		System.out.println(StaticVarAssign.a);
	}
}

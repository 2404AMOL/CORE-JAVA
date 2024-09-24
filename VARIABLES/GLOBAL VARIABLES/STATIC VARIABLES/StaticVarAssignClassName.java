//QNO4:-Can We Assign The Value To The Static varible Into Main Method If The Local Varible Is Present

//Answer:-No We Can't Assign The Value To The Static Varible If The local Varible Is Present Becuse
//1:-In Firstly it search For Local Variable Before Its Line If It IS Not Present
//2:-Then It Serches For The Static Varible

//==>On Such Case If You Try To Initialize Value To The Static Varible
//Then You Have To Take Help Of Class Name As Refernce
class StaticVarAssignClassName
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

		System.out.println(StaticVarAssignClassName.a);
	}
}

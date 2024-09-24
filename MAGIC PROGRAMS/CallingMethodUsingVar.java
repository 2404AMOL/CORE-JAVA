class CallingMethodUsingVar 
{
	static int a = printString();

	public static int printString()
	{
		System.out.println("Hello World");
		return 1;
	}
	public static void main(String[] args) 
	{

	}
}

//We can call the Method without using variable also.
//==>>For that you have	declare the varible No matter it is Static Variable or Non-Static Variable
//==>>For declare the method then pass the Method Call Statement to the Variable.

//QNO1:-Design Method Overloading Program For Wideling Process

class MethodWidening 
{
	public static void main(String[] args) 
	{
		test('a');
	}
	public static void test(double a)
	{
		System.out.println("Test(double)");
	}
	public static void test(int a)
	{
		System.out.println("Test(int)");//It Takes Nearest datatype 
	}
}

//Widening

//short
//char---->>> int---->>  long--->>  float  ---->>  double
//byte


/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>Test(int)									*
*************************************************/
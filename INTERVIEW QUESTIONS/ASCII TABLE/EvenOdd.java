//Que1:Java Program to Check Whether a Number is Even or Odd

class EvenOdd 
{
	public static void main(String[] args) 
	{
		int num=2;
//======================================================================/
		//=>1st way using Ternary Operator
		/*String res=num%2==0?"Even":"Odd";
		System.out.println(res);*/
//======================================================================/
		//=>2nd Using If else

		/*if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}*/
//======================================================================/
		//=>Method 3 : Using Bitwise Operator
		/*if (isEven(num))
			System.out.println("Even");
		else
		System.out.println("Odd");*/	
	}
	// Returns true if n is even, else odd
	/*static boolean isEven(int number)
	{
		// n & 1 is 1, then odd, else even
		return(!(number & 1));*/
	}
}

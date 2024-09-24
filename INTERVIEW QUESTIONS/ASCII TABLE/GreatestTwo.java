//Que : Java Program to Find Greatest of Two Numbers
/*Example
Input : num1 = 12 and num2 = 3
Output : 12*/

class GreatestTwo 
{
	public static void main(String[] args) 
	{
		int num1=24;
		int num2=4;
		/*Method 1: Using if-else Statements
		if (num1==num2)
		{
			System.out.println("Both Number Are Equal");
		}
		else if (num1>num2)
		{
			System.out.println("Number1 Is Greater");
		}
		else
		{
			System.out.println("Number2 is Greater");

		}*/

		/*Method 2: Using Ternary Operator

		String temp="";

		if (num1==num2)
		{
			System.out.println("Both Number Are Equal");
		}
		else
		{
			temp=num1>num2?"Number1 is Greater":"Number2 Is Greter";
			System.out.println(temp +" Is Greater");
		}*/

		//Method 3: Using inbuilt max Function

		if (num1==num2)
		{
			System.out.println("Both Number Are Equal");
		}
		else
		{
			System.out.println(Math.max(num1,num2)+" Is Greater");
		}


	}
}

//Que : Java Program to Check Leap Year or not
/*Conditions for Leap Year
For any year to be a leap year the following two conditions must be checked. If the year satisfies either of the conditions, it's considered a leap year. Following are the conditions
1. The year must be divisible by 400.
2. The year must be divisible by 4 but not 100*/

class LeapYear 
{
	public static void main(String[] args) 
	{
		int year=2020;
		/*Method 1: Using if-else Statements 

		if (year%400==0)
		{
			System.out.println(year + " Is a Leap Year");
		}
		else if (year%4==0 && year%100!=0)
		{
			System.out.println(year + " Is a Leap Year");
		}
		else
		{
			System.out.println(year+" Is Not a Leap Year");
		}*/
		
		/*Method 2: Using Ternary Operator

		int temp=(year%400==0)||(year%4==0 && year%100!=0)?1:0;

		if (temp==1)
		{
			System.out.println(year + " Is a Leap Year");
		}
		else
		{
			System.out.println(year + " Is Not a Leap Year");
		}*/

		/*ethod 2: Using if-else Statements 2

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			System.out.println (year + " is a Leap Year");

		//not leap year
		else
			System.out.println (year + " is not a Leap Year");*/

 
		//Method 3: Bonus Boolean Method

		boolean leap;

		if (year%400==0)
			leap=true;
		else if(year%4==0 && year%100!=0)
			leap=true;
		else
			leap=false;

		if (leap)
		{
			System.out.println(year + " Is a Leap Year");
		}
		else
		{
			System.out.println(year + " Is Not Leap Year");
		}

	}
}

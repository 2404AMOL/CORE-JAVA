//Que :-Program to Find the Sum of First N Natural Numbers using java
//==>Natural Number : Natural number are the positive integer number increasing by one.
//==>Ex:-1,2,3,4,5,6,7.....n

class SumOFFirstN_NaturalNum
{
	public static void main(String[] args) 
	{
		int num=5;
		
//======================================================================/
		//Method 1 : Using for Loop
		/*int sum=0;
		for (int i=0;i<=num;i++)
			sum+=i;
		System.out.println(sum);*/

//======================================================================/
	//Method 2 : Using Formula for the Sum of Nth Term

	/*Formula to Find the Sum of N terms
		Sum = ( Num * ( Num + 1 ) ) / 2*/
		
		System.out.println(num*(num+1)/2);
		
//======================================================================/	
	//Method 3 : Using Recursion
		int sum=getSum(num);

		System.out.println(sum);

	}
	static int getSum(int number)
	{
		if(number==0)
			return 0;

		return number+getSum(number-1)
	}



}

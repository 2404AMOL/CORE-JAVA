//Que:-Find the Sum of the Numbers in a Given Range in Java
//Example
//Input : a = 5 , b = 15
//Output : 45
class SumOFNumGivenRange   
{
	
	public static void main(String[] args) 
	{
		/*int a=5;
		int b=10;
		int sum=0;
		
		//Method 1: Using Brute Force
		for (int i=a;i<=b;i++)
		{
			sum+=i;
		}*/

		//System.out.println(sum);

		//Method 2: Using Recursion

		int a = 5;
		int b = 10;

		int sum = getSum (0, a, b);
		System.out.println ("The sum is " + sum);

	}

	static int getSum (int sum, int i, int b)
	{
		// stop when any recursion call tries to go over b (larger number)
		if (i > b)
			return sum;
		return i + getSum (sum, i + 1, b);
  }
}

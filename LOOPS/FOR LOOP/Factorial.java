//QNO5:-Write A Program To find the Factorial of Number.
class Factorial 
{
	public static void main(String[] args) 
	{
		int num=5;

		int fact=1;

		for (int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(num+" Factorial is : "+fact);
	}
}

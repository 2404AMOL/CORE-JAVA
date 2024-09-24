//QNO4:-Write A Program to Print Odd Number Between 0 to 100
class PrintOdd1to100 
{
	public static void main(String[] args) 
	{
		int num=1;

		do
		{
			if (num%2==1)
			{
				System.out.println(num);
			}
			num++;
		}
		while (num<=100);
	}
}
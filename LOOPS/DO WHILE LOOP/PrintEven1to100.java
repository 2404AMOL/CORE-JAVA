//QNO3:-Write A Program to Print Even Number Between 0 to 100
class PrintEven1to100 
{
	public static void main(String[] args) 
	{
		int num=1;

		do
		{
			if (num%2==0)
			{
				System.out.println(num);
			}
			num++;
		}
		while (num<=100);
	}
}

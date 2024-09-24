//QNO4:- Write a Program to print the Even Numbers Between 1 to 100
class PrintEven1to100
{
	public static void main(String[] args) 
	{
		int num=0;
		while (num<=100)
		{
			if (num%2==0)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}

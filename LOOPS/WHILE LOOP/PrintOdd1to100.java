//QNO5:- Write a Program to print the Odd Numbers Between 1 to 100
class PrintOdd1to100
{
	public static void main(String[] args) 
	{
		int num=0;
		while (num<=100)
		{
			if (num%2==1)//num%2!=0
			{
				System.out.println(num);
			}
			num++;
		}
	}
}

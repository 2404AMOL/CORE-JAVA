//QNO19:- Write a Program to print 10 Odd Number

class Print10Odd
{
	public static void main(String[] args) 
	{
		int num=1;
		while (num<=10)
		{
			if (num%2==1)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}

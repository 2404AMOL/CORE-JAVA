//QNO23:- Write a Program to Print Odd Numbers Between 1 to 25
class PrintOdd1To25
{
	public static void main(String[] args) 
	{
		int num=1;
		int count=0;
		while (num<=25)
		{
			if (num%2==1)
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
		System.out.println("Total Count : "+count);
	}
}

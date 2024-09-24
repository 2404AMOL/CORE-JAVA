//QNO17:- Write a Program to count the number is divisible by 5 and 7 between 0 to 100
class DivBy5A7Bet100
{
	public static void main(String[] args) 
	{
		int num=1;
		int count=0;
		while (num<=100)
		{
			if ((num%5==0) && (num%7==0))
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
		System.out.println("Total Count : " + count);
	}
}

//QNO15:- Write a Program to count the number is divisible by 3 and 4 between 0 to 100
class DivBy3A4Bet100
{
	public static void main(String[] args) 
	{
		int num=1;
		int count=0;
		while (num<=100)
		{
			if ((num%3==0) && (num%4==0))
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
		System.out.println("Total Count : " + count);
	}
}

//QNO24:- Write a Program to Print 10 Even Number in Reverse Order 
class Reverse10EvenNum
{
	public static void main(String[] args) 
	{
		int num=10;

		while (num>=1)
		{
			if (num%2==0)
			{
				System.out.println(num);
			}
			num--;
		}
	}
}

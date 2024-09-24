//QNO18:- Write a Program to print 10 Even Number

class Print10Even
{
	public static void main(String[] args) 
	{
		int num=1;
		while (num<=10)
		{
			if (num%2==0)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}

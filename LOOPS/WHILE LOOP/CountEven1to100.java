//QNO12:- Write a Program to count All Even Numbers Between 1 to 100
class CountEven1to100
{
	public static void main(String[] args) 
	{
		int num=1;
		int count=0;
		
		while (num<=100)
		{
			if (num%2==0)
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
		System.out.println("Total Count is : "+count);
	}
}

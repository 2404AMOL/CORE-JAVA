//QNO9:- Write a Program to print Addition of 10 Numbers
class Addition10Num
{
	public static void main(String[] args) 
	{
		int num=1;
		int sum=0;

		while (num<=10)
		{
			sum+=num;
			num++;
		}
		System.out.println("Summation of 10 Numbers is : "+sum);
	}
}

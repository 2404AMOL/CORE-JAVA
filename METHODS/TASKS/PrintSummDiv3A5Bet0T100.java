class PrintSummDiv3A5Bet0T100 
{
	public static void printSumm(int num)
	{
		int Sum=0;
		while (num<=100)
		{
			if (num%3==0 && num%5==0)
			{	
				System.out.println(num);
				Sum+=num;
			}
			num++;
		}
	System.out.println("The Summation Is:"+Sum);
	}
	public static void main(String[] args) 
	{
		printSumm(0);
	}
}

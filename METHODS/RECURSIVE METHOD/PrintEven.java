class PrintEven 
{
	public static void printEven(int num)
	{
		System.out.println(num);
		if (num==20)
		{
			return;
		}
		num+=2;
		printEven(num);
	}
	public static void main(String[] args) 
	{
		printEven(0);
	}
}

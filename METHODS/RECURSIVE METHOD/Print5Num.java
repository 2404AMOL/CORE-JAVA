class Print5Num 
{
	public static void printNum(int num)
	{
		System.out.println(num);
		if (num==5)
		{
			return;
		}
		num++;
		printNum(num);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		printNum(0);
		System.out.println("End");
	}
}

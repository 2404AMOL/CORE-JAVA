class Factorial 
{
	public static void main(String[] args) 
	{
		int start=1;
		int fact=1;
		int num=6;
		while (start<=num)
		{
			fact*=start;
			start++;
		}
		System.out.println(fact);
	}
}

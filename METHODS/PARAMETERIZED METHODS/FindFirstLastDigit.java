//QNO5:-Design A Method To Find a a First Digit or Last of a Number
class FindFirstLastDigit 
{
	public static void main(String[] args) 
	{
		firstDigit(87878);
		lastDigit(39437);
	}
	public static void firstDigit(int num)
	{
		while (num>=10)
		{
			num=num/10;
		}
		System.out.println(num);
	}
	public static void lastDigit(int num)
	{
		num=num%10;
		System.out.println(num);
	}
}

class MaximumFourNum 
{
	public static void main(String[] args) 
	{
		int a=7;
		int b=4;
		int c=15;
		int d=24;

		if (a>b && a>c && a>d)
		{
			System.out.println(a + " : A is Greater");
		}
		else if (b>a && b>c && b>d)
		{
			System.out.println(b + " : B is Greater");
		}
		else if (c>a && c>b && c>d)
		{
			System.out.println(c + " : C is Greater");
		}
		else
		{
			System.out.println(d + " : D is Greater");
		}
	}
}

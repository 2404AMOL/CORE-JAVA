class Pattern4 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=5;r++)
		{
			char ch='A';
			for (int c=1;c<=5;c++)
			{
				if (r==1 || c==1)
				{
					System.out.print(" "+"*");
				}
				else
				{
					System.out.print(" "+ch);
					ch++;
				}
			}
		System.out.println();
		}
	}
}

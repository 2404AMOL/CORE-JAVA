class Pattern3 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=5 ;c++ )
			{
				if (r==c)
				{
					System.out.print(" "+1);
				}
				else
				{
					System.out.print(" "+2);
				}
			}
		System.out.println();
		}
	}
}

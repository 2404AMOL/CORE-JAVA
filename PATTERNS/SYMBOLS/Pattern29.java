class Pattern29 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=5;c++)
			{
				if (r%2!=0)
				{
					if (c%2==0)
					{
						System.out.print(" "+"*");
					}
					else
					{
						System.out.print(" "+"|");
					}
				}
				else
				{
					if (c%2==0)
					{
						System.out.print(" "+"|");
					}
					else
					{
						System.out.print(" "+"*");
					}
				}
			}
		System.out.println();
		}
	}
}

/*for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=5;c++)
			{
				if (r==c || r+c==6 || r+c==8 || r+c==4)
				{	
						System.out.print(" "+"|");
				}
				else
				{		
						System.out.print(" "+"*");
				}
			}
		System.out.println();
	}*/
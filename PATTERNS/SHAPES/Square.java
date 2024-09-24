class Square 
{
	public static void main(String[] args) 
	{
		int r=1;
		for (;r<=5; )
		{
			int c=1;
			for (;c<=5;)
			{
				if (r==1 ||c==1 || r==5 || c==5)
				{
					System.out.print(" "+"*");
				}
				else
				{
					System.out.print(" "+" ");
				}
				
				c++;
			}

			System.out.println();

			r++;
		}
	}
}

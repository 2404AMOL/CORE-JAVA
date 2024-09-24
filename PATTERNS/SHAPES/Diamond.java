class Diamond 
{
	public static void main(String[] args) 
	{	
		int n=10;
		for (int r=1;r<=n; )
		{
			for (int c=n;c>=1; )
			{
				if (r>=c)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");
				}
				c--;
			}
			System.out.println();
			r++;
		}
		for (int r=1;r<=n; )
		{
			for (int c=1;c<=n;)
			{
				if (c>=r)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}
}

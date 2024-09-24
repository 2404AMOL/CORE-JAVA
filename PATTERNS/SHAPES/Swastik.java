class Swastik 
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int r=1;r<=n;r++)
		{
			for (int c=1;c<=n;c++)
			{
				if ((c==4 ||r==n-3)||(c==1 && r>=1 && r<=n/2)||(r==n && c>=1 && c<=n/2)||(c==n && c>=n/2 && r>n/2)||(r==1 && c>n/2 && c<=n))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}

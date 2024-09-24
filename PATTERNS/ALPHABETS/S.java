/*QNO18:-

	* * * * * * *
	*
	*
	*
	*
	* * * * * * *
	  			*
				*
				*
	* * * * * * *
*/					
class S 
{
	public static void main(String[] args) 
	{
		int n=10;
		for (int r=1;r<=n;r++)
		{
			for (int c=1;c<=n;c++)
			{
				if ((r==1 || r==n/2 || r==n) ||(c==1 && r<=n/2)||(c==n && r>=n/2))
				{
					System.out.print("*"+" ");
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

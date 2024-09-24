/*QNO20:-

	*			*
	*			*
	*			*
	*			*
	*			*
	*			*
	  * * * * * 
		
*/					
class U 
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int r=1;r<=n;r++)
		{
			for (int c=1;c<=n;c++)
			{
				if ((c==1 && r<n)|| (r==n && c>1 && c<n)||(c==n && r<n))
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

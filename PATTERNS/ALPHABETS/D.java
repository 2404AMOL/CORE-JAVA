/*QNO4:-

	* * * * 
	*		*
	*		*
	*		*
	* * * *	
	
*/
class D 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=5;c++)
			{ 
				if (c==1 ||(r==1 && c<=5-1) || (r==5 && c<=5-1) || ((c==5) && (r>1 && r<=5-1)))
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
